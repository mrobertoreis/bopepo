
/* 
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Created at: 21/04/2008 - 23:35:28
 *
 * ================================================================================
 *
 * Direitos autorais 2008 JRimum Project
 *
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode 
 * usar esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma 
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que 
 * haja exigência legal ou acordo por escrito, a distribuição de software sob esta 
 * LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER TIPO, sejam 
 * expressas ou tácitas. Veja a LICENÇA para a redação específica a reger permissões 
 * e limitações sob esta LICENÇA.
 * 
 * Criado em: 21/04/2008 - 23:35:28
 * 
 */
	
package br.com.nordestefomento.jrimum.bopepo;

import br.com.nordestefomento.jrimum.JRimumException;


/**
 * 
 * <p>
 * Qualquer exceção gerada durante a geração de um Boleto gera uma <code>BoletoExceptiton</code>. Centraliza e localiza os problemas relativos a geração de um boleto.
 * </p>
 * 
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @see br.com.nordestefomento.jrimum.JRimumException
 * @see br.com.nordestefomento.jrimum.bopepo.BoletoExceptiton
 * 
 * @since 0.2
 * 
 * @version 0.2
 */

public class BoletoExceptiton extends JRimumException {

	/**
	 * 
	 */
	public BoletoExceptiton() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public BoletoExceptiton(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public BoletoExceptiton(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public BoletoExceptiton(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}