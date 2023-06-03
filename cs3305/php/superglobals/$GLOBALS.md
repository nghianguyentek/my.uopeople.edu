# `$GLOBALS`

An associate array containing all [variables](../variables.md) which are currently defined in the [global scope](../variables.md#scopes) of the script. The variable names are the keys of the array.

## Sample

```php
$globalVar = 'a';

function accessGlobalVar() {
  echo $GLOBALS["globalVar"];
}
```