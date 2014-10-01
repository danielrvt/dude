class Dude {

    def greet(msg: String) = msg match {
        case "Hi" => "Hey!"
        case "Hello" => "Wazaaaa!"
        case _ => new Exception("POW!!! ¡Punch in the face!")
    }    
    
}
