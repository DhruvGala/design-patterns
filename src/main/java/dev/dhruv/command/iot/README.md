## Command Design Pattern
The Command Design Pattern is a behavioral design pattern that turns a request into a stand-alone object, allowing parameterization of clients with different requests, queuing of requests, and support for undoable operations.

* The Command Pattern encapsulates a request as an object, allowing for the separation of sender and receiver.
* Commands can be parameterized, meaning you can create different commands with different parameters without changing the invoker(responsible for initiating command execution).
* It decouples the sender (client or invoker) from the receiver (object performing the operation), providing flexibility and extensibility.
* The pattern supports undoable(action or a series of actions that can be reversed or undone in a system) operations by storing the state or reverse commands.

### example 
* Imagine you are tasked with designing a remote control system for various electronic devices in a smart home. 
* The devices include a TV, a stereo, and potentially other appliances. 
* The goal is to create a flexible remote control that can handle different types of commands for each device, such as turning devices on/off, adjusting settings, or changing channels.