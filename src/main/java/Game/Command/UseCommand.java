package Game.Command;

import Game.Character.Player;
import Game.Item.Item;
import Game.Item.UsableItem;

public class UseCommand implements Command{
    private Player player;
    private UsableItem item;

    public UseCommand(Player player, UsableItem item){
        this.player = player;
        this.item =item;
    }

    public String use(){
      return item.use(player);
    }

    public String execute(){
        return use();
    }
}