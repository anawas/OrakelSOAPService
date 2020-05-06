/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.abbts.sya;
import javax.jws.WebService;

/**
 *
 * @author Andreas Wassmer (aw@andreas-wassmer.ch)
 */
@WebService
public class Orakel implements OrakelIf {

    @Override
    public String getSpell ()
    {
        return Sayings.getSpell();
    }
}
