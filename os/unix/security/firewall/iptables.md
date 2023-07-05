# iptables

In Unix-like OSes, iptables is a command-line [firewall](README.md) controlling network traffic through tables, chains, rules, and options criteria.

## Table types

- `filter`: default if no table is specified; used by [DAC](../dac.md)
- `nat`: used if encoutering a new connection packet
- `mangle`: used for specialized packet alternation
- `raw`: used to untrack 
- `security`: used by [MAC](../mac.md) and is often triggered after `filter`

## Chains

A chain is a set of [rules](#rules).

### Built-in chains of `filter` and `security` tables

- `INPUT`: altering packets destined for local sockets
- `FORWARD`: altering non-locally-generated packets before routing out
- `OUTPUT`: altering locally-generated packages before routing out

### Built-in chains of `nat` table

- `PREROUTING`: altering packages as soon as they come in
- `INPUT`
- `OUTPUT`
- `POSTROUTING`: altering packets as they are about to go out

### Built-in chains of `mangle` table

- `PREROUTING`
- `INPUT`
- `FORWARD`
- `OUTPUT`
- `POSTROUTING`

### Built-in chains of `raw` table

- `PREROUTING`
- `OUTPUT`

## Rules

A rule is a condition group

## Options

An option is additional settings applied to [rules](#rules).