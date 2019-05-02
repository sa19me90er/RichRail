// This is an ANTLR file. It defines a domain-specific language (DSL) for creating trains and wagons, connecting them, and removing or deleting them.
// Make sure you have installed the "ANTLR v4 grammar plugin" for Eclipse!
// This file needs to be compiled by right-clicking this file > Generate ANTLR Recogniser. MAKE SURE YOU HAVE CONFIGURED ANTLR FIRST (see right-click on the file again)! OUTPUT DIRECTORY (..\RichRail\src\main\java), PACKAGE (com.harambeshabitat.app.logic.parser and LANGUAGE should be set, at least!
grammar RichRail;

options {
    language = Java;
}

@header {
    import nl.hu.interpreter.NewTrainCommand;
    import nl.hu.interpreter.NewWagonCommand;
    import nl.hu.interpreter.AddCommand;
    import nl.hu.interpreter.GetSeatsCommand;
    import nl.hu.interpreter.DeleteTrainCommand;
    import nl.hu.interpreter.DeleteWagonCommand;
    import nl.hu.interpreter.RemoveCommand;
}

command : newcommand | addcommand | getcommand | deletetraincommand | deletewagoncommand | remcommand;
// plaats ' ' tussen strings
// runnen is (handler.
NEW : 'new ';
TRAIN : 'train ';
WAGON : 'wagon ';
ADD : 'add ';
DELETE : 'delete ';
REMOVE : 'remove ';
GETNUMSEATS : 'getnumseats ';

newcommand : newtraincommand | newwagoncommand;
newtraincommand : NEW TRAIN ID {new NewTrainCommand($ID.text).execute();};
newwagoncommand	: NEW WAGON ID ('numseats' NUMBER)? {new NewWagonCommand($ID.text, $NUMBER.text).execute();};
addcommand 	: ADD add=ID ' to ' to=ID {new AddCommand($add.text, $to.text).execute();};
getcommand 	: GETNUMSEATS type to=ID {new GetSeatsCommand($type.text, $to.text).execute();};
deletetraincommand 	:  DELETE TRAIN ID {new DeleteTrainCommand($ID.text).execute();};
deletewagoncommand 	:  DELETE WAGON ID {new DeleteWagonCommand($ID.text).execute();};
remcommand	:  REMOVE rem=ID ' from ' to=ID {new RemoveCommand($rem.text, $to.text).execute();};
 


type : TRAIN | WAGON;

ID : ('a'..'z')('a'..'z'|'0'..'9')*;
NUMBER	: ('0'..'9')+;
WHITESPACE : ( ' ' | '\t' | '\r' | '\n'| '\u000C' )+ -> skip;