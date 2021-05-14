## ChessIoT_Dev

This repository contain an extension of [CHESS tool](https://www.eclipse.org/chess/start.html) covenring IoT domain. 
CHESS is a reputable model driven engineering environment used to model and analyse safety critical complex systems.
CHESS is an open shource tool and can be accessed at https://www.eclipse.org/chess/start.html. 

The CHESSIoT extension can be installed on-top of CHESS by following this [link](https://github.com/feliIhirwe/CHESSIoT-features)

The definition of the CHESSIoT DSL abstract syntax and the semantics:

CHESSIoT DSL has been designed and developed on top of **CHESSML language**. 
It multi-view modeling approach, so different model parts are developed from different views which makes the model by itself large in some cases. 

At design time, CHESSIoT enforces that all the components and elements be IoT specific and follows the already existing CHESS modeling methodologies such as _component-based design_ and _multi-view modeling_ approach. 

The extension is composed of four different metamodels referred to as profiles in Papyrus. 
In addition to other domain-specific views presented in the CHESS tool, CHESSIoT adds the IoT sub-view to permit the user to activate the services and palettes provided by the extension. 

- [x] **CHESSIoTSystem** profile serves to cover the system-level design aspects in which the systems main blocks and their interconnections are defined. This is done in the CHESS System View invoking the IoT sub-view. Extending SysML blocks, the IoT high-level blocks and their corresponding flow-ports are defined and later annotated with formal properties as contracts. 

- [x] **CHESSIoTSoftware** profile contains the definition used to describe the IoT software components and their behaviors. The software design is done in Component view. In this regard, the user can decompose the system's software components and sub-components provided by specific palettes. In CHESSIoT the component behaviors are defined by using state machines. CHESSIoT have introduced a more flexible and easy way event-based modeling mechanism using on state and their transitions. In our case, the IoTEvents and IoTActions can be modeled separately and later be invoked as many times as possible or by many different IoTElements states.  An IoTState always should be linked to an "OnEntry" and an "OnExit" event which in turn can be either generic, incoming, or an outgoing event. An IoTAction being for sending payload, receiving payload, or any other action-type can then be associated with each event in form of effect. A Payload is any type of message that will be passed between IoTElements through ports and they can be reused as many times as possible. 


- [x] **CHESSIoTHardware** profile contains a physical deployment representation of the virtual components designed in Component view. The hardware modeling activities are performed in Deployment View. The hardware design also includes the definition of target platform specifications such as the number of processors and core units to be deployed.

- [x] **CHESSIoTOperational** profile will contain all the information regarding the communication aspects of the system. Once implemented, the operational modeling activities will be also performed in the CHESS’s Component View. Ideally, the information related to communication mode, servers, communication protocols, and storage resources will be modeled and analysed by using this profile. The purpose of adding this part is to support the performance analysis of different resource blocks involved.
