�}>* 
 �  y��ѧ��    ��4+�9�'c����>Hf��b���gE�04�︱�7X��"c*��Yo�O��z���Pt��N�!���FAjvx�	��/w�md9Exe ��hO��-��#�xF��8��1�,�������b�.�I��&�%\� 1�s����gk9&p&1Sѥ� �"�n�}	��@>���[�>��M��<(B��s��yx]��a&$�̱�����c�ni����@õ)��Z�h,?^�(�C�ka'��4��o�sy���Ơ��/����/��n쿮��;����>�/�TQ��bJϭU�C7�鉦�}mq�mB۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;l�38��'��Ј��-ϤU��5K���s�8b�wq��cp�%4%f�rr�}u��4�v*p�]��\o������Go��c��]| �Oii��hr aB"�q�ê5�&�Hp�bT��'���\����1��;���gQ.k26U*�xP�����R����%�$RT9<y ؃�Dusì�:V��]�����9�
l��"�$�O��)��rO��w�2�|�5˧q�t�T�����u�ı)SE�����]��P���Ua[񘡍t���"�F���P���e��hM�(�"5K�Y�M��"0m����*z���L�9�C:���,2����J���0.��UB��RG���	l��D*%Rgw��Fo���i�G"��<�R�`Q{7ٹ�Q2�w��Z�/)I���r��nȫ�����:�ĥC�}���0 w*^.w�=*����7��u�� iX�zDF�X��H�lC�N�~Q���K�CT��]�q�U~,b+�)�(s���WTv�  */
    public void exceptionLogOut(){
        JRExceptionHandler crashHandler = JRExceptionHandler.getInstance();
        crashHandler.init(context);
    }

    public OwnCache getOwnCache() {
        return ownCache;
    }

    /**
     * 设置离线后 默认调转到的 页面
     * @param classz
     */
    public void setLoginPage(Class classz){
        ownCache.setLoginPage(classz);
    }
}
