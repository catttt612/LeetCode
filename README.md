
### leetcode plugin config:
1. TemplFilePath:
```
Anywhere/LeetCode/src/main/java/com/catttt
```
2. CodeFileName:
```
$!velocityTool.camelCaseName(${question.titleSlug})
```
3. CodeTemplate:
```java
package com.catttt.leetcode.editor.en;

public class $!velocityTool.camelCaseName(${question.titleSlug}) {
    public static void main(String[] args) {
        Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
    }
${question.code}
}
```

