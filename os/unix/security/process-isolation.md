# Process isolation

The OS allocates a separate address space for each process, and one process can access its address space only. This help prevents process interference and thus protects the OS and normal ones from malicious or infected processes.

In addition, Unix enhances process isolation by [namespaces](#namespaces) and [control groups](#cgroups) (aka., cgroups).

## Namespaces

By default, a newly created process will inherit namespaces from its parent.

### Namespace types

- PID
- UTS: host and domain name
- Network: network stack
- IPC: [IPC](../../../ipc/README.md) method
- Mount

## Cgroups

Unix uses cgroups to control available resources allocated for a process group.

### Cgroup commands

#### Create a cgroup

`cgcreate`

#### Add a process to a cgroup

`cgjoin`

#### Change resource limits of a cgroup

`cgset`