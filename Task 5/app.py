import streamlit as st
from streamlit_option_menu import option_menu
import pandas as pd

def is_valid_assignment_name(name):
    return name.isalpha()

def is_valid_mark(mark):
    return mark.isdigit()

def data_entry(csv, assignment_name, ku_mark, t_mark, c_mark, a_mark):
    df = pd.read_csv(csv)

    if not all(is_valid_mark(mark) for mark in [ku_mark, t_mark, c_mark, a_mark]):
        st.warning("Please enter valid Marks (numbers only).")
        return df

    new_data = {
        "Assignment Name": assignment_name,
        "Knowledge": int(ku_mark),
        "Thinking": int(t_mark),
        "Communication": int(c_mark),
        "Application": int(a_mark),
    }
    new_row = pd.DataFrame([new_data])
    df = pd.concat([df, new_row], ignore_index=True)
    df.to_csv(csv, index=False)
    return df

def get_df(csv):
    df = pd.read_csv(csv)
    return df

with st.sidebar:
    st.title("Welcome")
    selected = option_menu("Taskbar", ["Home", 'Dashboard', 'Settings'],
                           icons=['house', 'calendar', 'gear'], menu_icon="cast", default_index=0)

    if selected == "Dashboard":
        option = st.selectbox(
            "Select a course",
            ("Math", "English", "Science", "Art"),
            index=None,
            placeholder="Courses",
        )

if selected == "Home":
    st.title("Aeros Academic Dashboard")
    st.divider()

    st.header("Overall Class Average")
    courses = ["Math", "English", "Science", "Art"]
    overall_average = []

    for course in courses:
        csv = course + ".csv"
        df = get_df(csv)

        if not df.empty:
            # Calculate mean for each assignment
            assignment_means = df[['Knowledge', 'Thinking', 'Communication', 'Application']].mean(axis=1)

            # Calculate the overall mean for the class
            class_average = assignment_means.mean()
            
            # Store data for each class
            overall_average.append({"Class": course, "Mark": class_average})

    # Create a DataFrame from the collected data
    overall_average_df = pd.DataFrame(overall_average)

    # Display the overall class mean table
    st.table(overall_average_df)

elif selected == "Dashboard":

    if option:

        st.title(f"{option} Class Performance")

        csv = option + ".csv" 
        df = get_df(csv)

        st.sidebar.header("Student Data Entry")
        with st.sidebar.form("options_form"):
            assignment_name = st.text_input("Assignment Name")
            ku_mark = st.text_input("Knowledge Mark")
            t_mark = st.text_input("Thinking Mark")
            c_mark = st.text_input("Communication Mark")
            a_mark = st.text_input("Application Mark")
            add_data = st.form_submit_button()

        if add_data:
            df = data_entry(csv, assignment_name, ku_mark, t_mark, c_mark, a_mark)
        st.dataframe(df)

        if add_data or not df.empty:
            for aspect in ["Knowledge", "Thinking", "Communication", "Application"]:
                st.header(f"{aspect} Weight")
                st.line_chart(df, x="Assignment Name", y=aspect, use_container_width=True)

    else:
        st.title("To View Performance")
        st.header("Select a Course")

elif selected == "Settings":
    st.title("Settings")
    st.divider()
    st.toggle('This Button Does Not Do Anything')

