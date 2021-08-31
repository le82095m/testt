from selenium import webdriver
import os
from selenium.webdriver.common.action_chains import ActionChains

drive = webdriver.Chrome()
#
# file = "file:///"+os.path.abspath("D:\java")
#
# drive.get(file)
# drive.maximize_window()
#
# inputs = drive.find_elements_by_tag_name("input")
#
# for input in inputs:
#     if input.get_attribute("type") == "checkbox":
#         input.click()
#
#
# drive.switch_to.frame("f1")
# drive.switch_to.frame("f2")
# drive.switch_to.default_content()

drive.find_element_by_link_text("link1").click()

ele = drive.find_element_by_id("dropdown1").find_element_by_link_text("Another action")

ActionChains(drive).move_to_element(ele).double_click().perform()

name = drive.find_element_by_name("")

drive.find_element_by_id("tooltip").click()
# 得到了操作弹窗的据句柄
alert = drive.switch_to.alert
alert.accept()

drive.find_element_by_tag_name("input").click()

alert = drive.switch_to.alert
alert.send_keys("123")
alert.accept()

drive.find_element_by_id("show_modal").click()
div0 = drive.find_element_by_class_name("modal_body")
div0.find_element_by_id("click").click()

divs = drive.find_elements_by_id("button")
divs[0].click()


drive.implicitly_wait(10)
