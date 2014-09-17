public class PlayerExistEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private String message;
 
    public CustomEvent(String example) {
        message = example;
    }
 
    public String getMessage() {
        return message;
    }
 
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
