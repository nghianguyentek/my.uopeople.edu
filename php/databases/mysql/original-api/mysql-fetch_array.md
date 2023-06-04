# `mysql_fetch_array()`

*Deprecated in PHP 5.5*

*Removed in PHP 7.0*

Fetch the next row (record) of a resultset and return it as an array or `false` if there is no next row

## Syntax

```php
mysql_fetch_array(
  resource $resultset,
  int $array_type = MYSQL_BOTH
): array|false
```

- `$array_type_type`: type of returned array
  - `MYSQL_ASSOC`
  - `MYSQL_NUM`
  - `MYSQL_BOTH`

## References

- https://www.php.net/manual/en/function.mysql-fetch-array.php