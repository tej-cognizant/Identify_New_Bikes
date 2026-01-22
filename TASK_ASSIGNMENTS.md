# Project Task Assignments - Identify New Bikes Automation

## Project Overview
This is a Selenium WebDriver automation project for testing the ZigWheels website. The project structure is ready with templates, and implementation is needed for all page objects, test classes, and the main execution file.

---

## 📋 TICKET 1: Implement BasePage Class
**Priority:** HIGH  
**Assignee:** [Team Member Name]  
**Estimated Time:** 2-3 hours  
**File:** `src/main/java/com/cts/inb/pages/BasePage.java`

### Tasks:
- [ ] Implement the constructor to initialize WebDriver, WebDriverWait, JavascriptExecutor, and PageFactory
- [ ] Implement `scrollByPercentage(double percentage)` method to scroll page by percentage
- [ ] Implement `scrollToTop()` method to scroll to top of page
- [ ] Test scrolling functionality works correctly

### Acceptance Criteria:
- Constructor properly initializes all protected variables
- Scroll methods use JavascriptExecutor correctly
- Thread.sleep is used appropriately for stability

---

## 📋 TICKET 2: Implement HomePage Class
**Priority:** HIGH  
**Assignee:** [Team Member Name]  
**Estimated Time:** 3-4 hours  
**File:** `src/main/java/com/cts/inb/pages/HomePage.java`  
**Dependencies:** TICKET 1 (BasePage)

### Tasks:
- [ ] Implement constructor to initialize Actions class
- [ ] Implement `hoverOnNewBikes()` - hover on NEW BIKES menu
- [ ] Implement `clickUpcomingBikes()` - click on Upcoming Bikes link
- [ ] Implement `hoverOnMoreMenu()` - hover on MORE menu with scroll to top
- [ ] Implement `clickUsedCars()` - click on Used Cars link
- [ ] Verify all locators are working correctly

### Acceptance Criteria:
- Actions class is properly initialized in constructor
- All hover operations use Actions.moveToElement()
- Wait conditions are properly applied before interactions
- Thread.sleep is used for stability where needed

---

## 📋 TICKET 3: Implement LoginPage Class
**Priority:** HIGH  
**Assignee:** [Team Member Name]  
**Estimated Time:** 4-5 hours  
**File:** `src/main/java/com/cts/inb/pages/LoginPage.java`  
**Dependencies:** TICKET 1 (BasePage)

### Tasks:
- [ ] Implement `clickLoginIcon()` - scroll to top and click login icon
- [ ] Implement `clickGoogleSignIn()` - click Google sign-in button
- [ ] Implement `switchToGoogleLoginWindow()` - handle window switching
- [ ] Implement `enterEmail(String email)` - enter email in Google login
- [ ] Implement `clickNext()` - click Next button
- [ ] Implement `takeScreenshot(String filePath)` - capture and save screenshot using TakesScreenshot and FileUtils
- [ ] Test screenshot functionality saves files correctly

### Acceptance Criteria:
- Window switching logic correctly identifies and switches to Google popup
- Screenshot is saved to specified path using Apache Commons IO FileUtils
- Error handling is present in takeScreenshot method
- All waits and thread sleeps are properly implemented

---

## 📋 TICKET 4: Implement UpcomingBikes Class
**Priority:** HIGH  
**Assignee:** [Team Member Name]  
**Estimated Time:** 2-3 hours  
**File:** `src/main/java/com/cts/inb/pages/UpcomingBikes.java`  
**Dependencies:** TICKET 1 (BasePage)

### Tasks:
- [ ] Implement `clickBikesUnder2Lakhs()` - scroll and click bikes under 2 lakhs filter
- [ ] Implement `clickYamahaBrand()` - scroll and click Yamaha brand
- [ ] Verify scroll percentages work correctly (0.20 and 0.50)
- [ ] Test element visibility and clickability

### Acceptance Criteria:
- Uses BasePage scrollByPercentage method correctly
- Wait conditions are applied before clicks
- Thread.sleep provides stability between actions

---

## 📋 TICKET 5: Implement UsedCarsPage Class
**Priority:** MEDIUM  
**Assignee:** [Team Member Name]  
**Estimated Time:** 3-4 hours  
**File:** `src/main/java/com/cts/inb/pages/UsedCarsPage.java`  
**Dependencies:** TICKET 1 (BasePage)

### Tasks:
- [ ] Implement `selectCity()` - click on Chennai city link
- [ ] Implement `displayUsedCars()` - extract and display top 10 used cars
- [ ] Use dynamic element finding with `driver.findElements(By.cssSelector("a.fnt-22"))`
- [ ] Format console output with proper headers and numbering
- [ ] Handle empty car names appropriately

### Acceptance Criteria:
- Displays maximum 10 cars using Math.min()
- Console output is properly formatted with headers
- Empty car names are skipped
- Uses dynamic element finding to avoid stale elements

---

## 📋 TICKET 6: Implement YamahaBikes Class
**Priority:** HIGH  
**Assignee:** [Team Member Name]  
**Estimated Time:** 5-6 hours  
**File:** `src/main/java/com/cts/inb/pages/YamahaBikes.java`  
**Dependencies:** TICKET 1 (BasePage)

### Tasks:
- [ ] Implement `displayYamahaBikesUnder4Lakhs()` method
- [ ] Wait for bike containers with class "modelItem"
- [ ] Extract bike model name from XPath: `.//div[contains(@class,'mke-ryt')]//strong`
- [ ] Extract price from XPath: `.//*[contains(text(),'Lakh')]`
- [ ] Parse price string to double value (remove "Rs.", "Lakh", etc.)
- [ ] Filter bikes with price < 4.00 Lakh
- [ ] Extract expected launch date from XPath: `.//*[starts-with(text(),'Expected')]`
- [ ] Display bike details: Model Name, Price, Expected Launch
- [ ] Handle exceptions for individual bikes gracefully
- [ ] Display total count of bikes under 4 Lakhs

### Acceptance Criteria:
- Only bikes with price < 4.00 Lakh are displayed
- Price parsing handles different formats correctly
- Expected launch date shows "Not Available" if missing
- Console output is properly formatted with separators
- Exception handling prevents one bike error from stopping entire process

---

## 📋 TICKET 7: Implement BaseTest Class
**Priority:** HIGH  
**Assignee:** [Team Member Name]  
**Estimated Time:** 3-4 hours  
**File:** `src/test/java/com/cts/inb/tests/BaseTest.java`  
**Dependencies:** All Page Classes (TICKETS 1-6)

### Tasks:
- [ ] Implement `setupReport()` - initialize Extent Report with path "reports/test-execution-report.html"
- [ ] Implement `setup()` - configure ChromeOptions to disable notifications, launch browser, initialize all page objects
- [ ] Set implicit wait to 0 seconds
- [ ] Navigate to "https://www.zigwheels.com/"
- [ ] Maximize browser window
- [ ] Implement `tearDown()` - quit browser if not null
- [ ] Implement `tearDownReport()` - flush Extent Report
- [ ] Add console output messages for debugging

### Acceptance Criteria:
- ChromeOptions properly disables browser notifications
- All 5 page objects are initialized in @BeforeMethod
- Browser is properly closed in @AfterMethod
- Extent Report is initialized and flushed correctly
- Console messages help track test execution

---

## 📋 TICKET 8: Implement HomePageTest Class
**Priority:** MEDIUM  
**Assignee:** [Team Member Name]  
**Estimated Time:** 2-3 hours  
**File:** `src/test/java/com/cts/inb/tests/HomePageTest.java`  
**Dependencies:** TICKET 2, TICKET 7

### Tasks:
- [ ] Implement `testNavigateToUpcomingBikes()` test method
  - Create ExtentTest with name "Navigate to Upcoming Bikes Test"
  - Add test.info() and test.pass() logging for each step
  - Call homePage.hoverOnNewBikes()
  - Call homePage.clickUpcomingBikes()
- [ ] Implement `testNavigateToUsedCars()` test method
  - Create ExtentTest with name "Navigate to Used Cars Test"
  - Add test.info() and test.pass() logging for each step
  - Call homePage.hoverOnMoreMenu()
  - Call homePage.clickUsedCars()

### Acceptance Criteria:
- Both tests use ExtentReportManager to create test instances
- Each step is logged with info() before execution and pass() after
- Tests execute in correct priority order (1 and 2)

---

## 📋 TICKET 9: Implement LoginTest Class
**Priority:** MEDIUM  
**Assignee:** [Team Member Name]  
**Estimated Time:** 2-3 hours  
**File:** `src/test/java/com/cts/inb/tests/LoginTest.java`  
**Dependencies:** TICKET 3, TICKET 7

### Tasks:
- [ ] Implement `testGoogleLogin()` test method
- [ ] Create ExtentTest with name "Google Login Test"
- [ ] Implement all 6 steps with proper logging:
  1. Click login icon
  2. Click Google sign-in
  3. Switch to Google login window
  4. Enter email: "abc@gmail.com"
  5. Click Next button
  6. Capture screenshot at specified path
- [ ] Add Thread.sleep(3000) at end

### Acceptance Criteria:
- Test priority is 3
- Each step has info() and pass() logging
- Screenshot path is correctly specified
- Test handles window switching properly

---

## 📋 TICKET 10: Implement UpcomingBikesTest Class
**Priority:** MEDIUM  
**Assignee:** [Team Member Name]  
**Estimated Time:** 2-3 hours  
**File:** `src/test/java/com/cts/inb/tests/UpcomingBikesTest.java`  
**Dependencies:** TICKET 2, TICKET 4, TICKET 6, TICKET 7

### Tasks:
- [ ] Implement `testYamahaBikesUnder4Lakhs()` test method
- [ ] Create ExtentTest with name "Yamaha Bikes Under 4 Lakhs Test"
- [ ] Implement all 5 steps:
  1. Hover on NEW BIKES menu
  2. Click on Upcoming Bikes
  3. Click on Bikes Under 2 Lakhs
  4. Select Yamaha brand
  5. Display Yamaha bikes under 4 Lakhs
- [ ] Add proper logging for each step

### Acceptance Criteria:
- Test priority is 1
- All navigation and filtering steps are properly logged
- Test successfully displays Yamaha bikes under 4 Lakhs

---

## 📋 TICKET 11: Implement UsedCarsTest Class
**Priority:** MEDIUM  
**Assignee:** [Team Member Name]  
**Estimated Time:** 2-3 hours  
**File:** `src/test/java/com/cts/inb/tests/UsedCarsTest.java`  
**Dependencies:** TICKET 2, TICKET 5, TICKET 7

### Tasks:
- [ ] Implement `testUsedCarsInChennai()` test method
- [ ] Create ExtentTest with name "Used Cars in Chennai Test"
- [ ] Implement all 4 steps:
  1. Hover on MORE menu
  2. Click on Used Cars
  3. Select Chennai city
  4. Display top 10 used cars
- [ ] Add proper logging for each step

### Acceptance Criteria:
- Test priority is 2
- All steps are properly logged with info() and pass()
- Test successfully displays used cars in Chennai

---

## 📋 TICKET 12: Implement YamahaBikesTest Class
**Priority:** MEDIUM  
**Assignee:** [Team Member Name]  
**Estimated Time:** 2-3 hours  
**File:** `src/test/java/com/cts/inb/tests/YamahaBikesTest.java`  
**Dependencies:** TICKET 2, TICKET 4, TICKET 6, TICKET 7

### Tasks:
- [ ] Implement `testYamahaBikesUnder4Lakhs()` test method
- [ ] Create ExtentTest with name "Yamaha Bikes Test"
- [ ] Implement all 5 steps:
  1. Hover on New Bikes menu
  2. Click on Upcoming Bikes
  3. Click on Bikes Under 2 Lakhs filter
  4. Click on Yamaha brand
  5. Display Yamaha bikes under 4 Lakhs
- [ ] Add Thread.sleep(2000) at end

### Acceptance Criteria:
- Test priority is 1
- All steps are properly logged
- Test successfully displays Yamaha bikes information

---

## 📋 TICKET 13: Implement Main.java
**Priority:** LOW  
**Assignee:** [Team Member Name]  
**Estimated Time:** 3-4 hours  
**File:** `src/main/java/Main.java`  
**Dependencies:** All Page Classes (TICKETS 1-6)

### Tasks:
- [ ] Configure ChromeOptions to disable notifications
- [ ] Initialize ChromeDriver with options
- [ ] Set implicit wait to 0 seconds
- [ ] Navigate to "https://www.zigwheels.com/"
- [ ] Maximize browser window
- [ ] Initialize all 5 page objects
- [ ] Execute complete workflow:
  1. Navigate to Upcoming Bikes (hover + click)
  2. Filter bikes under 2 Lakhs
  3. Select Yamaha brand
  4. Display Yamaha bikes under 4 Lakhs
  5. Navigate to Used Cars (hover + click)
  6. Select Chennai city
  7. Display used cars
  8. Login with Google (all steps)
  9. Take screenshot
- [ ] Add Thread.sleep for stability
- [ ] Quit browser at end

### Acceptance Criteria:
- All page objects are properly initialized
- Complete workflow executes without errors
- Screenshot is captured at correct path
- Browser is properly closed at end

---

## 📋 TICKET 14: Testing & Validation
**Priority:** MEDIUM  
**Assignee:** [Team Member Name]  
**Estimated Time:** 4-5 hours  
**Dependencies:** All tickets (1-13)

### Tasks:
- [ ] Run all TestNG tests and verify they pass
- [ ] Verify Extent Report is generated correctly
- [ ] Verify screenshots are saved properly
- [ ] Run Main.java and verify complete workflow
- [ ] Check console output for all display methods
- [ ] Verify all bikes displayed meet the < 4 Lakh criteria
- [ ] Verify exactly 10 used cars are displayed
- [ ] Fix any compilation errors
- [ ] Fix any runtime errors
- [ ] Document any known issues

### Acceptance Criteria:
- All tests pass successfully
- Extent Report shows all test steps
- Screenshots are saved in correct location
- Console output is properly formatted
- No compilation or runtime errors

---

## 📋 TICKET 15: Code Review & Documentation
**Priority:** LOW  
**Assignee:** [Team Lead/Senior Developer]  
**Estimated Time:** 2-3 hours  
**Dependencies:** TICKET 14

### Tasks:
- [ ] Review all implemented code for best practices
- [ ] Verify proper use of Page Object Model pattern
- [ ] Check wait strategies are appropriate
- [ ] Verify exception handling is present
- [ ] Review code comments and clarity
- [ ] Update README.md with execution instructions
- [ ] Document test data and expected results
- [ ] Add any missing JavaDoc comments

### Acceptance Criteria:
- Code follows Selenium best practices
- All methods have appropriate wait conditions
- Exception handling prevents test failures
- Documentation is complete and clear

---

## 📊 Project Summary

**Total Tickets:** 15  
**Estimated Total Time:** 40-50 hours  
**Priority Distribution:**
- HIGH: 7 tickets
- MEDIUM: 7 tickets  
- LOW: 2 tickets

**Recommended Assignment Strategy:**
1. Start with BasePage (TICKET 1) - Critical foundation
2. Parallelize page implementations (TICKETS 2-6)
3. Implement BaseTest (TICKET 7)
4. Parallelize test implementations (TICKETS 8-12)
5. Implement Main.java (TICKET 13)
6. Testing & validation (TICKET 14)
7. Final review (TICKET 15)

---

## 🔧 Technical Stack
- **Language:** Java
- **Framework:** Selenium WebDriver, TestNG
- **Reporting:** ExtentReports
- **Build Tool:** Maven
- **Browser:** Chrome
- **Design Pattern:** Page Object Model (POM)

---

## 📞 Support & Questions
For any questions or blockers, contact the project lead or raise them in the team channel.

**Good luck with the implementation! 🚀**
