package me.magicall.game.skill;

import me.magicall.game.Game;
import me.magicall.game.io.OperatingException;
import me.magicall.game.io.OutputSource;
import me.magicall.game.player.Player;
import me.magicall.tagInterfaces.HasDescription;
import me.magicall.tagInterfaces.HasNameGetter;

/**
 * 一个原始的技能类，与具体角色、玩家、游戏无关
 * 
 * @author MaGiCalL
 */
public interface Skill extends HasNameGetter, HasDescription, OutputSource {

	void action(Game game, Player player) throws OperatingException, NoTargetSelectingException;

	char getHotKey();

}
