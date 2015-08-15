package me.magicall.game.sanguosha.core.card.cfg;

import me.magicall.game.card.CardCfg;
import me.magicall.game.sanguosha.core.card.CardTypes;
import me.magicall.game.sanguosha.core.card.Flower;
import me.magicall.game.sanguosha.core.skill.Skill;

/**
 * @author Liang Wenjian
 */
public class 顺手牵羊 extends CardCfg {

    public 顺手牵羊(final int point, final Flower flower) {
        super(CardTypes.IMMEDIATE_JINNANG, point, flower, (Skill) null);//TODO
    }
}
