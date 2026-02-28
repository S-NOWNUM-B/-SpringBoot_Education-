rootProject.name = "spring-boot-education"

// Автоматически подключаем все папки с проектами (которые содержат build.gradle.kts или build.gradle)
rootDir.listFiles()?.forEach { file ->
    if (file.isDirectory && file.name !in listOf("build", "gradle", "docs", ".git", ".gradle", ".idea")) {
        val buildFile = file.resolve("build.gradle.kts")
        if (buildFile.exists() || file.resolve("build.gradle").exists()) {
            include(file.name)
        }
    }
}