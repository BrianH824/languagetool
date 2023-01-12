/* LanguageTool, a natural language style checker 
 * Copyright (C) 2021 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.rules.es;

import org.languagetool.rules.AbstractTextToNumberFilter;

public class TextToNumberFilter extends AbstractTextToNumberFilter {

  static {
    numbers.put("cero", (float) 0);
    numbers.put("medio", (float) 0.5);
    numbers.put("un", (float) 1);
    numbers.put("uno", (float) 1);
    numbers.put("una", (float) 1);
    numbers.put("dos", (float) 2);
    numbers.put("tres", (float) 3);
    numbers.put("cuatro", (float) 4);
    numbers.put("cinco", (float) 5);
    numbers.put("seis", (float) 6);
    numbers.put("siete", (float) 7);
    numbers.put("ocho", (float) 8);
    numbers.put("nueve", (float) 9);
    numbers.put("diez", (float) 10);
    numbers.put("once", (float) 11);
    numbers.put("doce", (float) 12);
    numbers.put("trece", (float) 13);
    numbers.put("catorce", (float) 14);
    numbers.put("quince", (float) 15);
    numbers.put("dieciséis", (float) 16);
    numbers.put("diecisiete", (float) 17);
    numbers.put("dieciocho", (float) 18);
    numbers.put("diecinueve", (float) 19);
    numbers.put("veinte", (float) 20);
    numbers.put("veintiuno", (float) 21);
    numbers.put("veintidós", (float) 22);
    numbers.put("veintitrés", (float) 23);
    numbers.put("veinticuatro", (float) 24);
    numbers.put("veinticinco", (float) 25);
    numbers.put("veintiséis", (float) 26);
    numbers.put("veintisiete", (float) 27);
    numbers.put("veintiocho", (float) 28);
    numbers.put("veintinueve", (float) 29);
    numbers.put("treinta", (float) 30);
    numbers.put("cuarenta", (float) 40);
    numbers.put("cincuenta", (float) 50);
    numbers.put("sesenta", (float) 60);
    numbers.put("setenta", (float) 70);
    numbers.put("ochenta", (float) 80);
    numbers.put("noventa", (float) 90);
    numbers.put("cien", (float) 100);
    numbers.put("ciento", (float) 100);
    numbers.put("doscientos", (float) 200);
    numbers.put("trescientos", (float) 300);
    numbers.put("cuatrocientos", (float) 400);
    numbers.put("quinientos", (float) 500);
    numbers.put("seiscientos", (float) 600);
    numbers.put("setecientos", (float) 700);
    numbers.put("ochocientos", (float) 800);
    numbers.put("novecientos", (float) 900);
    numbers.put("doscientas", (float) 200);
    numbers.put("trescientas", (float) 300);
    numbers.put("cuatrocientas", (float) 400);
    numbers.put("quinientas", (float) 500);
    numbers.put("seiscientas", (float) 600);
    numbers.put("setecientas", (float) 700);
    numbers.put("ochocientas", (float) 800);
    numbers.put("novecientas", (float) 900);
    multipliers.put("mil", (float) 1000);
    multipliers.put("millón", (float) 1000000);
    multipliers.put("millones", (float) 1000000);
    multipliers.put("billón", (float) 10E12);
    multipliers.put("billones", (float) 10E12);
    multipliers.put("trillón", (float) 10E18);
    multipliers.put("trillones", (float) 10E18);
  }

}
