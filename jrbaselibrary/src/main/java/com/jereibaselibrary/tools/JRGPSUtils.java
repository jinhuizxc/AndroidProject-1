�}�* 
 2  ��j2�Κ�    ��d+��v;c��*�e��1�� L���(F�$��̠�x0k\�����LK׀z	q��x;#z�"���K�M䌹in��M�0֡o����S�}�Pf��7�g���Njd��Κ!d0T�sG����p�%�/�C�lJ�@����ф�e�Z�S�\�r�6Tk���(t�[�4�ɣ{�F�����Nz^|����jJUE.r~��"��A��@L���E�H�Iz��r����dB���d@�5�+^�h�*�i�Z�-�Q��ǅs�X��AG �i�ɔ����@�VK�D���)�Jv�� � -�j�9����=�T��[�Z��Zt~�tt��a���to��5��!��{J��̜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;lD-���Iq W�;S�����E!��p���B���)�M>��˕��.-�kN��#ʼ�&�����ؔ���Z��)��X��2qqB��W3ޘ���3��~���^@��a'��~�=rn"�vo��[���{��& !���0� \�h�<-�7{S��k}sUG!^��q�T�<�a9(������z���II��G��Ϡ����(����'�m�}��kޏ��]h�ة(QAN.a��e�(����w,��3;Q�lL�b���s	/^k�'��C%��#!�3pŧI�(2JX�h�B �#���c��G�h6��Y��9e}��n)���5A�j�3��$����ط%=O{Èe ��{/⯾[�J�%$s����D�p�2Aw��2G#'zU)�+�у1�����d�^zƱ=��PV~�:KCT�F�&��䣽��^��O�7+
�P*���;,��J�Yk:,I�tP��oE 5����@Y��?(�lD=��q�4�o������,��wP�8[\/Q^&5����G�e(�3�+��VPy�"T�\��t���X�"��6a�.7,u�b��bɀ�Aځ�?�R�Ne�-��į(�l���ܕ�;�Z5�-TQ����XӫxM���l�T�ڳF�c��d��������^�!����-��ǐ��!�I(��Խw����a�!-�(���u�E�o+�E]3P�~��s��>��?OD��3��3es�E�j�D�V=��@�ʎ ��D�ޕ3��I�1Axv"�P\�T��c���c��/K����gJR�x�I1ޥ�nY��۾��*I_���bY��{/]I�hN|Lod&(՟d`N��ͽy$���ŏ�����(�ñ��T��M�ş��;��ʂ/el��K�@�_��FXe��X�]�it?ҙޣʻ���+�D�� Zu_�CP�3P+(���̘���{���sP%C�譇tmxCmԭ	b���f�����U�p�$���!p�ԧJl�1�P�o<�V��S�x�|(����Ă���̻��g�H7�R�5��{�X�QQY �	��u�A�Β��kE��K�U�_���+��q�V]�����&�����f���X7v�C*dbb��������ళ�H�4c}P��=���+��~��*��ɲ{=��D�-h���㽀*+h��O�5yn4|��~�����&�]�~�0�S�l;+�_3����hǷ2D�A%��x=K9��Ϥ;��!,Wѣ���^I����+��@y.��+��Ӟ��#��<��E�W�oZT�y�|���tS��3��v��ƕk=��JLK.���^��5NJ����,��j����!_����C���ȞC���{�Ҿ
j���\I���k�fJ�O�ܛ;�~޼��� �<�����;������QmU.&�V������������"��~�[of��I�L{��#��Y�R�G�9���*����L��H��P�7�=�0��պϜ�^�G���2�$�Gpcom.android.settings",
                "com.android.settings.widget.SettingsAppWidgetProvider");
        GPSIntent.addCategory("android.intent.category.ALTERNATIVE");
        GPSIntent.setData(Uri.parse("custom:3"));
        try {
            PendingIntent.getBroadcast(context, 0, GPSIntent, 0).send();
        } catch (PendingIntent.CanceledException e) {
            e.printStackTrace();
        }
    }
}
