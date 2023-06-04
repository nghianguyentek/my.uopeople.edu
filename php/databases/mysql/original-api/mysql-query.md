# `mysql_query()`

*Deprecated in PHP 5.5*

*Removed in PHP 7.0*

Send a query to a MySQL server

## Syntax

```php
mysql_query(
  string $query,
  resource $connection_link = NULL
): mixed
```

- `$connection_link`: if unspecified, the last open connection will be used

## Return values

1. If do not have permission, `false`
1. Based on the query:
  - Result set output: `resource|false`, see [mysql_fetch_array()](mysql-fetch_array.md)
  - Others: `bool`

## References

- https://www.php.net/manual/en/function.mysql-query.php