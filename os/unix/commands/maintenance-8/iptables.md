# `iptables(8)`

## Syntaxes

`iptables [-t table] {-F|-L|-Z} [chain [rule-num]] [options...]`


## Examples

### Display all chains of a table

`sudo iptables [-t table] -L`

`sudo iptables -L`

### Display rules of a particular table chain

`sudo iptables [-t table] -L chain`

`sudo iptables -L INPUT`