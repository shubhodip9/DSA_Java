# DSA using Java 

This repository contains Java programs for learning and practising basic, intermediate and advanced data structures and algorithms.

Along with that, there is an entire structured workflow to demonstrate how to:
- Make a folder for this project using the Command Prompt
- Create JAVA files for individual pieces of code using Command Prompt
- Open these JAVA files in VSCode using Command Prompt
- Run them in the VSCode Terminal
- Add 'git' to the folder
- Add individual files (Main.java, BubbleSort2.java etc.) to the main branch with commit messages
- Create a separate 'branch'
- Add file(s) to the separate 'branch' with commit messages
- Moving back to the 'main branch'
- Checking which 'git branch' command is currently at
- Create README.md file for the whole repository
- Make changes to the README.md file and push the file with commit messages 

## Important Git Commands:

- git init                             : Initializes a new Git repository in the current folder
- git status                           : Shows the current state of the working directory and staging area, helpful to check changes
- git add <filename>                   : Stages specific file(s) for the next commit. Example: git add README.md
- git add .                            : Stages all changed files (new, modified, deleted) in the directory for commit
- git commit -m "message"              : Commits the staged changes with a meaningful message. Example: git commit -m "Updated README"
- git log                              : Displays the commit history (author, date, commit hash, and message)
- git remote add origin <URL>          : Links your local repo to a remote GitHub repo (first-time setup)
- git remote -v                        : Shows the current remote URL(s) linked to your repo
- git push -u origin main              : Pushes commits to the main branch on GitHub and sets upstream tracking
- git push                             : Pushes local commits to the corresponding branch on the remote repo
- git branch                           : Lists all local branches and highlights the current branch
- git checkout -b branch <branch-name> : Creates a new branch and switches to it immediately
- git switch <branch-name>             : Switches between branches (modern alternative to checkout)
- git diff                             : Shows the differences between modified files and the last commit or between branches
- git clone <repo-url>                 : Clones a remote repository to your local machine
- git pull                             : Fetches and merges changes from the remote repository to the current branch

## Command Line prompts

### Navigating to the current folder: 
- ![Navigate_CODING.png](Images/Navigate_CODING.png) 

### Making a new folder for DSA programs in JAVA:
- ![Create_DSA.png](Images/Create_DSAJava.png)

### Navigating to the newly created folder:
- ![Navigate_DSAJava.png](Images/Navigate_DSAJava.png)

### Create an empty CLASS:
- ![Create_CLASS.png](Images/Create_CLASS.png)

### Open the CLASS in VSCode: 
- ![Open_CLASS_VSCode.png](Images/Open_CLASS_VSCode.png)

### Execute or Run the CLASS in VSCode Terminal:
- ![Run_CLASS_VSCode_Terminal.png](Images/Run_CLASS_VSCode_Terminal.png)

### Add 'git' to the Project Folder:
- ![git_init.png](Images/git_init.png)

### Add a remote repository to your local git repository:
- ![git_remote_add.png](Images/git_remote_add.png)
- ![git_remote_add2.png](Images/git_remote_add2.png)
- 'local branch': on PC

### Explanation for 'remote':
- ![remote.png](Images/remote.png)
- 'remote branch': on Github

### Explanation for 'origin':
- ![origin.png](Images/origin.png)

### Explanation for 'local Git repository':
- ![local_git_repo1.png](Images/local_git_repo1.png)
- ![local_git_repo2.png](Images/local_git_repo2.png)
- ![local_git_repo3.png](Images/local_git_repo3.png)

### Adding a file to the staging area / Stage the file:
- ![git_add_Main.png](Images/git_add_Main.png)

### Committing the file with a commit message:
- ![git_commit_Main.png](Images/git_commit_Main.png)

### Renaming the branch to 'main':
- ![Rename_main.png](Images/Rename_main.png)
- ![reason_rename_main1.png](Images/reason_rename_main1.png)
- ![reason_rename_main1.png](Images/reason_rename_main2.png)
- ![reason_rename_main1.png](Images/reason_rename_main3.png)

### 'push origin main' to Git:
- ![git_push-u_origin_main.png](Images/git_push-u_origin_main.png)
- ![push_origin1.png](Images/push_origin1.png)
- ![push_origin2.png](Images/push_origin2.png)

### List all local branches and show which branch user is currently at - 'git branch':
- ![git_branch.png](Images/git_branch.png)

### 'git checkout main':
- ![git_checkout_main.png](Images/git_checkout_main.png)
- ![checkout_main_reason](Images/checkout_main_reason.png)

### Adding, Committing and Pushing another class to 'main branch':
- ![push_bubble_sort2](Images/push_bubble_sort2.png)

### Creating a 'new branch':
- ![create_new_branch.png](Images/create_new_branch.png)

### Adding, Committing and Pushing a class to the 'new branch':
- ![push_file_new_branch.png](Images/push_file_new_branch.png)

### Shifting to 'main branch':
- ![switch_to_main.png](Images/switch_to_main.png)

### Creating, Adding, Committing and Pushing a 'README.md' file:
- ![readme_create_add_commit_push.png](Images/readme_create_add_commit_push.png)

### Opening the README.md file in VSCode:
- ![open_readme.png](Images/open_readme.png)

### Listing all branches of the Github repo (local + remote):
- ![git_branch-a.png](Images/git_branch-a.png)
- 'git branch': only lists the local branches(on PC) not the remote ones(on Github)
- 'git branch -a': lists all local and remote branches

### Listing all branches of the Github repo and visualising in a Tree form:
- ![repo_tree_form.png](Images/repo_tree_form.png)

### Checking which branch user is currently on:
- ![git_status.png](Images/git_status.png)

### Listing the entire folder on the local drive:
- ![dir.png](Images/dir.png)

### Listing the entire folder with space occupied on the local drive:
- ![dir_storage_space.png](Images/dir-storage_space.png)

### Listing only the JAVA files of the folder on the local drive:
- ![dir_java_files.png](Images/dir_java_files.png)

### Checking git status before pushing README.md:
- ![pre_pushing_readme.png](Images/pre_pushing_readme.png)

### Pushing '/Images' (Images folder) to Github:
- ![push_Images_folder.png](Images/push_Images_folder.png)
- If you want your images to display correctly on GitHub, then you must push the 'Images/' folder (and all the .png files inside it) to the GitHub repository.
- GitHub renders your README.md directly from the repo, so if the images aren't there, the links will break.

### Pushing the changes in README to Github:
- ![push_readme.png](Images/push_readme.png)

## Contents

- Screenshots of Command lines in the Command Prompt
- JAVA classes
- `Main.java`: Hello World setup
- `BubbleSort.java`: Classic Bubble Sort with inline logic
- `BubbleSort2.java`: Modular Bubble Sort using separate Swap function

## Branches

- `main`: Contains stable files (`Main.java`, `BubbleSort2.java`)
- `bubble-sort-original`: Contains the original `BubbleSort.java` (with in-place swapping)


