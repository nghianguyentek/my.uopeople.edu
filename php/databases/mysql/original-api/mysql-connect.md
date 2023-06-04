# `mysql_connect()`

*Deprecated in PHP 5.5*

*Removed in PHP 7.0*

Open (or reuse) a connection to a MySQL database server

## Syntax

```php
mysql_connect(
  string $server = ini_get("mysql.default_host"),
  string $username = init_get("mysql.default_user"),
  string $password = init_get("mysql.default_password),
  bool $new_link = false,
  int $client_flags = 0
): resouce|false
```

- `$new_link`: reuse or create a new link
- `$client_flags`: 
  - `MYSQL_CLIENT_COMPRESS`: use compression protocol
  - `MYSQL_CLIENT_IGNORE_SPACE`: allow space after function names
  - `MYSQL_CLIENT_INTERACTIVE`: interactive_timeout in seconds
  - `MYSQL_CLIENT_SSL`: use SSL


  ## References

  - https://www.php.net/manual/en/function.mysql-connect.php
  - https://www.php.net/manual/en/mysql.constants.php#mysql.client-flags