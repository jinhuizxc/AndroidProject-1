�}k* 
   K��}    ��U+��v+Gݤ��R�������eݾ��h���� ��{�[c�A�����0�g�=['�������y�|}�]8C��i;"u���ٺ�:V�\GU�!T�Sz�fL��`Q�4�����2�SrY�cπ�z��vq3����x��}qQ������χ%��J���b<�V��)#V����9���l��CSN&��Tھ����Ќ�ۙ���
��xLo��2�a�y���h�7����a�,�����h�/��lnz��[Զ��7:R�~@7��mi�S
˹���c�[~�n�7b6�9���fM�M����k�b�ghA�.*�WL�
�:l��!~���;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;l�-	>]X���@�_����߶Oc����`i��7��G�%�T�o8��9]�a��NY*��<T)�Slޕ��و������ ��{
�P�(��f���i4���x�ޖ�Lu��&�;k�;/������ 奺��|N�6\H��,�Ĵ:7���d)�:�.��t�����nK'*/ٝ�`fc���Q�Y�s$�`�H.��vB��W��PQ��Qjx��9�_#f��u���M,��5����%~mO�k��!�6�-�gd+&�y�J6���؂\OD߰"�Nj"�J�2�����	g?�vª=�ǉp4�5�EI��J�n���U��C��Ux��_��ܧZ�}���6�T�0��Z�}�ۡ�&�8c���BܚoJ�
H/�j�3O�?=UV֏_��X��_u ��Ѡ.{|c�4���G�P� �޲w��pg�r}'�#��N''��� �m"�VdY���ޛ�f.L���#<�5���lO1��iLM�	��B���vȼ�d�~?Kg�r Tony Green
 * @since 1.0
 */
public abstract class OrmChange {

	/**
	 * Subclasses implement this method to do their own logic to change types.
	 *
	 * @param fieldType
	 *            The field type passed in.
	 * @return Column type.
	 */
	public abstract String object2Relation(String fieldType);

}
