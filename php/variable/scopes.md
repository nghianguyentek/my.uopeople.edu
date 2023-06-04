# Variable scopes

- Global: not in a function
- Local: in a function

*If we access global variables in a function, we will get a warning or nothing*

```php
$a = 1;  // global
$b = 2

function test() {
  $a = 10;  // local
  echo $a;  // 10
  echo $b;  // nothing since we haven't assigned a value for local $b 
}
```

### Access global variables in a function

- By using [`global`](language-constructs/global.md) keyword
- By ssing [`$GLOBALS`](superglobals/%24GLOBALS.md#Sample) superglobal