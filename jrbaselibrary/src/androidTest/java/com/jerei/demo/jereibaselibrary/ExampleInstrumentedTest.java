�}* 
 �  ���A    ��+�9��fܤ����~4�E��G���;=ڋ4�|l;��$&[�r��$�i(@vv�D���Å9��Iwm`W�_t��onM�Ě�ٺd!
��G����)ҁ�TF5�([	�opۨk�M�P�lj��u��֝LD��]h�t�h=<GF�gv�_�S҉.�IUS�y����(:0B��I�">R8�/�`�&��(U��?��w�*��ғ[�˩A*$hK�_'ޚ"P�{N@�c���1~�E.�����$��[ğԶ}�
C{�Ps.r��8��v��m+WCSX����K)\�@�F¦����j>t�T�x��鉦�}mq�mB۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.jerei.demo.jereibaselibrary.test", appContext.getPackageName());
    }
}
