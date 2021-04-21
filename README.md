# xueqiu_appiumAutomation
环境准备：
Appium Desktop安装 安装地址: https://github.com/appium/appium-desktop/releases/
appium+appium-doctor
安装android-sdk

环境准备帖：https://ceshiren.com/t/topic/3851

1.	启动网易mumu后，adb devices无法查到设备的处理办法:
adb kill-server
adb remount
adb devices