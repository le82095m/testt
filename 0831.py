from selenium import webdriver
import time

drive = webdriver.Chrome()
url = drive.get("http://baidu.com/")

drive.find_element_by_id("kw").send_keys("123")
drive.find_element_by_id("su").click()
drive.find_element_by_name()
drive.find_element_by_class_name()
drive.find_element_by_link_text()
drive.find_element_by_partial_link_text()
drive.find_element_by_css_selector()
drive.find_element_by_xpath()

time.sleep(10)
drive.implicitly_wait(10)
# sleep()：强制等待，设置固定休眠时间。后脚本的执行过程中执行
# sleep()后线程休眠，而另外两种线程不休眠。

# implicitly_wait()：隐式等待，是设置的全局等待。设置等待时间，
# 是对页面中的所有元素设置加载时间，如果超出了设置时间的则抛出异常。
# 隐式等待可以理解成在规定的时间范围内，浏览器在不停的刷新页面，直到找到相关元素或者时间结束。

# WebDriverWait()：显示等待，是针对于某个特定的元素设置的等待时间，
# 在设置时间内，默认每隔一段时间检测一次当前页面某个元素是否存在，
# 如果在规定的时间内找到了元素，则直接执行，即找到元素就执行相关操作，
# 如果超过设置时间检测不到则抛出异常。默认检测频率为0.5s，默认抛出异常为：NoSuchElementException
time.sleep(8)



drive.quit()