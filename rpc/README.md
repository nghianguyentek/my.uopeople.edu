# Remote Procedure Call (RPC)

RPC is a protocol designed for calling procedures of processes running on other hosts (of course, it also works well when they are on the same machine). Thus, it promotes client-server architecture and distributed programming.

Although RPC protocol lets the implementers freely choose the transport protocol, most RPC frameworks use TCP (Transmission Control Protocol) or UDP (User Datagram Control) to implement it. If you know the IDL and C language and want to try RPC, look at RPC v2 RFC of Sun Microsystem (1988) and `rpcgen(1)` command.

## A typical RPC scenario steps

We can describe the steps of a typical RPC flow as the following:
- On the client side, the client code creates/gets the RPC client stub and calls the procedure.
- Based on the predefined transport protocol information, the RPC client stub builds the request message (including marshaling parameters and setting them into the request message), then sends it through the transport protocol and waits for the server response.
- The RPC server receives the message from the transport protocol and delivers the message to the corresponding RPC server stub. The RPC server stub demarshalls the received message to get the given arguments and call the corresponding function with them.
- When the function completes and returns, the RPC server stub builds the response message (including marshaling the returned value, if any, and setting it into the response message), then sends it back to the client.
- After receiving the server response, the client sends it to the corresponding RPC client stub. The RPC client stub demarshals the response message and sends the returned value to the caller code.

## Marshalling and unmarshalling

Marshalling is a process transformation in-memory data into a specific format for persistence or transmission. It's similar to the serialization process. On the other hand, unmarshalling is the reverse of marshalling, and similar to the deserialization process.

 ## Advantages

- Abstraction
- High performance
- Enable distributed environments
- Low coding cost
- Support process-oriented and thread-oriented

## Concerns

- Security
  - Authentication
  - Encrytion
  - Authorization
- Scalability
  - Load balancing
  - Resource utilization
- Fault tolerance
  - Redundancy
  - Failover
  - Graceful degradation
- Standardization
- Performance tuning
  - Network protocol optimization
  - Minimize data transfer
  - Reducing latency and overhead