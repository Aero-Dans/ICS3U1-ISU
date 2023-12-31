# Task #1 Read and Note & Reflect

## Files and Directories

### Files

**Definition of Files:** A computer file is a digital container that stores information, data or instructions in an organized way.

**Notes for Files:**
- Holds a wide range of content...
    * text, images, audio, video, software code, and much more
- Every File is...
    * identified by a **name**
    * stored within a **directory structure** or also known as a **folder**
- Tons of different files formats exisit...
    * made for a specific types of data
    * they enable the computer to handle complex tasks
        * organize and access data efficiently


>**Definition of File Extensions:** Suffixes added to the end of computer files, separated by one dot. These suffixes contain a couple character that show the file type. 
>
>Examples:
>- .txt - plain text file
>- .jpg - image in jpeg format
>- .py - python file extension
>- .java - java file extension
>
>Helps users and software identify how to handle a file


### Directory 

**Definition of Directory:** Also known as a folder, it helps to organize and store files in other such folders using a hierarchial manner.

**Benifits:**
1. *Organization:* Associated files are kept together, this makes it easier for the user to find and manage data
2. *Hierarchy:* Creates a Hierarchy or Ranking System, this mimics how information is categorized and managed in the real world
3. *Navigation:* Done through the file managers or command-line interfaces, users or applications can go through different folders to access the files
4. *Isolation:* Files in different folders can have the same name without any conflict, this is true as long as they are in different paths
5. *Security:* Permissions and Access Control settings can be applied to folders, allowing who can acesss or change sensitiive data
6. *Cleanliness:* The organized files in the folders reduce overall clutter and makes maitenance much easier 

> **The $HOME directory:** 
> 
> (Represented as ~ and known as Home Directory)
>
> - In Unix-like operating systems such as Linux and macOS
> - Serves as the default directory where a user's personal files and settings are stored
> - Each user on these such OS systems have their own unique home directory

---

## Use of Command Line

**Usage:** Allows programmers. This is crucial for things such as software development and system administration.

### Windows: Command Prompt & PowerShell

Command Prompt & PowerShell are both command-line interfaces found in Windows operating systems but serve different purposes

#### *Command Prompt*

**What is it?** A basic command-line interpreter in Windows. Utilizing text-basec commands, it communicates with the operating system so the user can perform various tasks such as management of files and directories. However there are limitations when it comes to scripting and automation.

#### *Power Shell*

**What is it?** A more capable command-line shell and scripting language from Microsoft. Compared to the tradional Command Prompt, a more advanced set of tools and capabilities are available. Such things the PowerShell allows are automation, task scripting, and system administration tasks through its object-oriented scripting approach. Another point is that since it is built on the .NET framework, the user is able to change multiple data sources such as files, registry, etc.


### macOS: Terminal
In the operating system macOS, the **Terminal** is an application that provides a command-line interface to communicate with the operating system. Simple text-based commands can result in the completion of various tasks, management of files and directories, and much more. The macOS Terminal is comparable to the Command Prompt in Windows and the shell in Unix-like systems.
  

### Important Commands for PowerShell & Terminal

1. **Listing Files and Directories:**
    - List files and directories: `ls` (macOS) or `dir - Force` (PowerShell)

2. **Changing Directories:**
    - Change directory: `cd [directory]`

3. **Working with Files and Directories:**
    - Create a new directory: `mkdir [directory]`
    - Create a new file: `touch [filename]`
    - Copy a file: `cp [source] [destination]`
    - Move or rename a file: `mv [source] [destination]`
    - Delete a file: `rm [filename]` (use with caution)
    - Delete a directory: `rmdir [directory]` (empty directory) or `rm -r [directory]` (non-empty directory)

4. **Displaying Text:**
    - Display Text: `echo [text]` (PowerShell) or `echo "[text]"` (macOS)

5. **Getting Help:**
    - Get help for a command: `man [command]` (macOS) or `Get-Help [command]` (PowerShell)

6. **Viewing File Contents:**
    - View file contents: `cat [filename]` (macOS) or `Get-Content [filename]` (PowerShell)

7. **Running Programs:**
    - Run a program or script: `[program]` or `./[script.sh]` (macOS) or `.\[script.ps1]` (PowerShell)

8. **Getting Current Location:**
    - Print current work directory: `pwd` (macOS) or `Get-Location` (PowerShell)

9. **Exiting the Terminal/PowerShell:**
    - Exit the Terminal/PowerShell: `exit`

---

## Git & GitHub


### What is Git?

**What is it?** A distributed version control system that helps developers tracks and manage changes to their code. Git makes it easier for group projects where multiple users work on different tasks at the same time. A history of changes is maintained by Git which allows the users to identify who did what work. 

>**Git Repository**
> 
> - **Definition of a Repository:** Data structure that stores metadata for a set of files or folders
> - When creating a repository
> - Git saves all the changes made to the code 
>   - Revision history created which can be revert changes


### What is GitHub?

**What is it?** Utilizing the Git version control system on a web-based platform, it allows its users to collborate with other people on various projects and tasks. Some tools that are provided include hosting repositories of code, managing changes through Git, and allowing multiple users to work on a project simultaneously. Just to name a few features of GitHub: code review, project management, and much more. Developers around the world use GitHub to collaborate with one another.

### Common Git Commands 

1. **Initialization:**
    * Initialize a new repoisitory: `git init`
    * Clone a repository: `git clone [repository URL]`
2. **Staging and Committing:**
    * Add changes to the staging area: `git add [file(s)]`
    * Commit staged chanmges: `git commit -m "Commit Messages`

3. **Checking Status and Differences:**
    * View status of working directory: `git status`
    * Show changes between working directory and staging: `git diff`
    * Show changes between staging and last commit: `git diff --staged` 

4. **Branches:**
    * List all branches: `git branch`
    * Create a new branch: `git branch [branch name]`
    * Switch to a branch: `git checkout [branch name]`
    * Create and switch to a new branch: `git checkout -b [branch name]`
    * Merge a branch into the current branch: `git merge [branch name]`

5. **Fetching and Pulling:**
    * Fetch changes from  a remote repository: `git fetch`
    * Pull changes from a remote repository into the current branch:
    `git pull`

6. **Pushing:**
    * Push local changes to a remote repository: `git push [remote name] [branch name]`

7. **Remote Repositories:**
    * Add a remote repository: `git remote add [remote add] [repository URL]`
    * Remove a remote repository: `git remote remove [remote name]`
    * Show information about remotes: `git remote -v`

8. **Commit History and Logs:**
    * Show commit history: `git log`
    * Show a brief summary of commit history: `git log --oneline`
    * Show commit history for a specific file: `git log [file]`

9. **Undoing Changes:**
    * Discard changes in working directory: `git checkout -- [file]`
    * Unstage changes: `git restore --staged [file]`
    * Revert a commit: `git revert [commit harsh]`
    * Delete untracked files: `git clean -f` 

10. **Configure Git:**
    * Configure user name: `git config --global user.name "Your Name"` 
    * Configure user email: `git config --global user.email "your@example"`

---

## Markdown

**Definition of Markdown:** Utilized for formatting and structuring normal text documents, it is a lightweight markup language specifically designed to be beginner friendly.

>The File Extension Markdown Files utilize is **.md**

### README File

**What is it:** A text file that introduces and explains a project in detail. It contains all the information for the reader to fully understand the code.

- Often written as a **markdown file**

### How to create a Markdown File

**How to create one:** As long as the file exntesion is set to **.md**, markdown files can be created in **any** code or text editors.

## Link to Reflection Document

> [Document Link](https://docs.google.com/document/d/14HnoUhj_meH1VblQwDkJB2ksJtW0GJGToSgi3JomW8Y/edit?usp=sharing)
