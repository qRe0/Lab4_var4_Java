JAVAC = javac
JAVA = java
SRC_DIR = src
BUILD_DIR = build
MAIN_CLASS = MatrixTest
JAR_FILE = myApp.jar

.PHONY: all clean run

all: $(JAR_FILE)

$(JAR_FILE): build
	@jar cvfe $(JAR_FILE) $(MAIN_CLASS) -C $(BUILD_DIR) .

build:
	@mkdir $(BUILD_DIR)
	$(JAVAC) -d $(BUILD_DIR) $(SRC_DIR)/*.java

run: $(JAR_FILE)
	$(JAVA) -jar $(JAR_FILE)

clean:
	rmdir /s $(BUILD_DIR)
	del $(JAR_FILE)
