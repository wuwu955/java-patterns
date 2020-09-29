package cn.ucaner.pattern.iluwatar.adapter;

/**
 * @author zhou.wu
 * @version v1.0
 * @package cn.ucaner.pattern.iluwatar.adapter
 * @description: xx
 * @date 2020/9/29 4:09 PM
 */
public class SteamBoatAdapter implements RowingBoat {


    private final SteamBoat boat;

    public SteamBoatAdapter() {
        boat = new SteamBoat();
    }


    @Override
    public void row() {
        boat.sail();
    }
}
