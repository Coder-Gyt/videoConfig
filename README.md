# 如果您觉得本项目对你有用，请随手star，谢谢
网上关于 Android 集成 FFmpeg 的文章很多，但大多数都只介绍了步骤，这里推荐几篇文章给大家

[Android 集成 FFmpeg (一) 基础知识及简单调用](https://blog.csdn.net/yhaolpz/article/details/76408829)

[Android 集成 FFmpeg (二) 以命令方式调用 FFmpeg](https://blog.csdn.net/yhaolpz/article/details/77146156)

[Android 集成 FFmpeg (三) 获取 FFmpeg 执行进度](https://blog.csdn.net/yhaolpz/article/details/77146156)



## Demo
![Demo](/pic/20181031154801.png)


# 要将 Git 项目添加到您的构建中：
步骤 1.将 JitPack 存储库添加到您的构建文件中

将其添加到存储库末尾的根 build.gradle 中：

allprojects { repositories { ... maven { url 'https://www.jitpack.io' } } }

步骤2.添加依赖

dependencies { implementation 'com.github.MiGo-jia:FFmpeg-Android-VideoCompression:Tag' }
