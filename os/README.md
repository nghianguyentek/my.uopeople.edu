# Operating Systems

## Kernel

The core of an operating system

- Memory virtualization: kernel-land and user-land memories

## Prompts

In a command-line interface, when the computer is wating for user input, it displays a prompt before the cursor. A default representation of a prompt often includes:
- The current username
- The computer name
- The current directory name/path
- Prompt character: `%` (macOS) and `$` (Linux)

For example, a prompt of `kihonvn` user on the `kihonvn-ubuntu` computer at the user home directory:
- In Linux, is `kihonvn@kihonvn-ubuntu:~$`
- In macOS, is `kihonvn@kihonvn-ubuntu ~ %`

### Change the prompt format

Based on the shell scripting language used by the CLI, we can customize the template of its prompts by changing the `PS1` variable:
- With Bash, in the `.bashrc` file at the user home directory
- With Zsh, in the `.zshrc` file at the user home directory

For example, the following code will change the format of prompts to a `$` symbol

```sh
PS1='$ ' 
```

Note that,
- If the `.*rc` file doesn't exist, we can create it with a text editor.
- The change is only applied on a new shell, not the opening ones.
- If you don't know shell scripting, it's a good time to go.

## Read more...

- https://www.comptia.org/blog/os-comparison
- https://www.softwaretestinghelp.com/best-operating-systems/
- https://www.freebsd.org/
- https://www.peerspot.com/categories/operating-systems-os-for-business
- https://github.com/Criviere/os
- https://github.com/brho/akaros