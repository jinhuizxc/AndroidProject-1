�}�* 
 �  ��Ku�    ��J+�1v)c������GCĺ�[z2��ȧlǕ*���O�K���4et1I�P���Q7������V�n��| 8hХ���4�mc|����@dל�k�M	zN�e��aF��i���h�q��"�c��s;m�kV�os��"/�(��w���2Ug ��Y�|��N�c����}��!:
��üQ����D?���K�W��.e��;n��z�v�ț���_��xd�a}eH��_:���$�G����j�8h�jT���s�L���R��C�D�i?�PĞe��t%	��oA��@�����2����@�7D�iX.G��߅9�$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;lD2��FH�+z˴�b�-���������C��G	EF
�������Sk>�H;�z�m���[�ͧ�ЗvBf	��GR��PN�� D#�`MQ p �%�b(nS����a��
r�L�i��|w%��N�*�l�V��e=��e5~�c��������*��s�CHَ����J&�/�ȁݨ~�"���6��3��J�Eg�6 ꈗ/����a�Q,VH�N�;�}Z�{��(�MR>�lp�l��$���V��Y_2ԱO�C��i��7P��2d�>_%%��x����#�P�r�L ]1��b�Rŭ��&_�7�a�^uf��`����l�	ZYm�J��].�Q]{�q�K�\��p�}g�S}�@[��EX��¯8��6❡��WHO�	_e	!pQb3g�G�R\P�U����[1�gL�����9�]|�Q�Z���ټ���^#O� �����Y�Jj�+��ݎ�\�ߓ�� &�5��2&X�]�!Z)=_�N��^|�Gl����d7�t�y�����6�п���h��㐯�qE2�?ru���کz�}N[�ӏ)pH�(��8�����ϫ�d&�g?}�l�Ok�f�A"��2&Im	G�+m2���T�1̱��#�B�����7�K�2�hVK��{�ß��>*M;@!�2r݆���&�,~�P��(;hcaLS�L�� =~p�]��A�ƽ ��xH��㡗Xd��z�w9ڋ�^�=�����z5ֲ�z �T ��,/�֥�&�6@�Ǽ��l;�_�Q#�/j�债�q��_�r�4��<8�s�ojK�j~��Qܑ��w���|��G�p�o>F�'𸻺�+5ڢ���L��N�sl޶��#����6V�.�iF ��W�i� }�4Z��y�"���"o��AgP��"W���&��~F}�"��X��Sf�*[��aoL���F�Ǆ;����}�/��ۉL�]y�/q�v��8�@�_��W�Ξ��]�d����������>\            TranslateAnimation mHiddenAction = new TranslateAnimation(Animation.RELATIVE_TO_SELF,
                    x, Animation.RELATIVE_TO_SELF, 0.0f,
                    Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                    y);
            mHiddenAction.setInterpolator(new AnticipateOvershootInterpolator());
            mHiddenAction.setDuration(time);
            view.startAnimation(mHiddenAction);
            view.setVisibility(View.GONE);
        }
    }
}
