package Mediator;

public class ChatMediator extends Mediator {

    @Override
    void meiate(String data) {
        for (int i = 0; i < colleagues.size(); i++) {
            colleagues.get(i).handle(data);
        }
    }

}
