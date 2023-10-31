package us.mattgreen;

import java.util.List;

public class UserInputService {
    private List<Talkable> zoo;

    public UserInputService(List<Talkable> zoo)
    {
        this.zoo = zoo;
    }

    public void askUserForPet()
    {
        System.out.println("What type of animal would you like to create?");
        System.out.println("1) Cat");

    }

}
