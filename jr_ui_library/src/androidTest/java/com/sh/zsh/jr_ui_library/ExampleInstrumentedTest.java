�}%* 
 �  #;�3|    �� +�9�'gܤ����>����.�1�Z?3�&*.BO&�eWA^��R*�d�dctA }I'����4�A���l��(�a�V9�Z��"��?P�)Q�9p�>�y(��L�7�T�E�7C[�N��Mn+|�RX��JN���u9"ֳPXO����E����lPO-$�0{΋{ٯs+��.6#py=3��w�����-(|�x�s��%n�+ F�t��r����}U��lp��ŋ	ܬЭ������r�i���J�4lT �%yK3�M�b�GW�gS-u?D�@�F¦����j>t�T�x��鉦�}mq�mB۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;est
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.sh.zsh.jr_ui_library.test", appContext.getPackageName());
    }
}
