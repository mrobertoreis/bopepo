package org.jrimum.bopepo.view.info.campo.caixa;

import org.jrimum.bopepo.Boleto;
import org.jrimum.bopepo.view.ResourceBundle;
import org.jrimum.bopepo.view.info.campo.BoletoInfoCampoView;

/**
 * Factory para determinar qual a implementação da CAIXA será usada de acordo com o convênio (SIGCB, SINCO, SICOB).
 * @author Rômulo Augusto
 */
public class BoletoInfoViewCaixaFactory {

	private static final int NN15 = 15;

	public static BoletoInfoCampoView create(ResourceBundle resourceBundle, Boleto boleto) {
		String nossoNumero = boleto.getTitulo().getNossoNumero();
		switch (nossoNumero.length()) {
			
			case NN15: return new BoletoInfoViewCaixaSIGCB(resourceBundle, boleto);
		}
		
		return null;
	}
}