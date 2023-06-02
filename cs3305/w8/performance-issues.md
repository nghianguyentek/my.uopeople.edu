# Performance issues

## Results

- Customer leaving

## Latency

### Causes

- [DNS resolution](dns.md)
- Transferred data size
- Server load
- Bad coding

### Solutions

- Using better DNS services
- Caching responses
  - APC - Alternative PHP Cache
  - Memcached
  - Varnish, reverse proxy cache
- CDN
- Reduce request and response size
- Upgrade better hosting
- Follow software development processes, coding standards and good practices

## Security

### Causes

- Bad coding
- Using lagacy and vulnerable components, including third-party ones
- Human
- Attacked

### Solutions

- Using distributed and high-available architectures
- TLS for data transfer, required by PCI (Payment Card Industry)
- Strong authentication
- Using up-to-date software and components
- Frequent backup
- Frequent audit (content, process, etc.)
- Using UAC (User Access Control)
- Effective monitoring and fraud detection
- Follow software development processes, coding & security standards and practices

## Availability

### Causes

- High load
- Bad hosting
- Attacked
- Disasters

### Solutions

- Using distributed and high-available architectures, especially cloud storages (that satisfy redundancy, load balancing, replication, etc.)
- Frequent backup
- Upgrade hosting provider or packages
- Using secruity services, such as Cloudflare

## Migration

### Causes

- Changing host, components, etc.
- Upgrading versions

### Solutions

- Frequent backup
- Using automated tools
- Strategies
  - Hybrid
  - Incremental
- Multi-model and multidimensional testings