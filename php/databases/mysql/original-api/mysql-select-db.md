# `mysql_select_db()`

*Deprecated in PHP 5.5*

*Removed in PHP 7.0*

Select a MySQL database from a connection

## Syntax

```php
mysql_select_db(
  string $database_name,
  resource $connection_link = NULL
): bool
```

- `$connection_link`: if unspecified, the last open connection will be used

## References

- https://www.php.net/manual/en/function.mysql-select-db.php