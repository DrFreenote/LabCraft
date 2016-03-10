# LabCraft

A mod of science, intrigue, and lacking safety standards.

---

## Development

To get started with development, you'll require Java JDK 8.  The IDE being used is IntelliJ IDEA, though others should work.

1. To start with, checkout this repo via CVS.  A fork may be created for side development.
2. Once downloaded, import the project via Gradle (Gradle plugin required).  This will take some time to process.
3. Under "Edit Configuration", add a new Configuration of type Application.  Set the name to "Minecraft Client", and main class to "GradleStart".  To keep the directory structure clean you can set the working directory as <your_path>\run.  You may need to manually create this folder.  A configuration can also be created for the server, name "Minecraft Server" and main class "GradleStartServer".
