�}n* 
 �  ���UޘU    ��+�9i�B���u�<P)�I�&���f�x}l�atK~�{�bu���
��зb��)�:���Ca1	ѳRm���`�/�W��!�,
2� �S8� l����y�Ҋ���"'�p�Q����U�gh�DȆ;�r��Y��_~9��@���e����IS6�_����A^������ݜ:"D,�9�zrY�O�O�G'&�d��-���I'���m���#�gD���h���//��!R`bB��_�Z�[I��6y����R8��t��s�~��Q�����?R�N�B)\�@�F¦����j>t�T�x��鉦�}mq�mB۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;lD$9�������c��yʼ�OEe1���+�d���I�l"�(���S}ҕ�7��T��nJ9B;����n�YKa�/�Q�7����-A��������^|��V[�&C�����u�{���2k|I1|GA��V ���O�?Gqq���p�;���:�I@�А�!ߺ�������Zٱ�E����{wT]N����n�Զl�Rާ2m #�J*����� ݹ�(�K����G�ؗ�T����P��+7��Z��rb�ә*��Ψ/	{�X�&%>�A}V��Ӕ�ۊK��_<����?Jߔ[b�Tq[x]���j�_WՒ5��/F�ں�����u�/�Q�p�Brt_���W��vh�g6U�c�!gAH��+=��;y_a�	�Gz���n�vU?mrZȷ�;����ZPW�@B���e9���X�]��?i�>=�KN1_�F�Y��n���^�\��<ʵ���5f��K��b�XR�0�o��=�]�[S������l�%�� ���$��+��E������S͓����?���}���n?�L a驸�3S��͕����>?y�����R�"[���}5���x��������9@��1 ���@)�/oJ��\8�KU/���~�aDZ]��U)-3=a��3��Q%`G ����  �zH_"�(���Ƈ���3�k�)M
��'��i`��Q�����[bm�N<�!0x3H̲bxu�Yς�v��������tQ.�z�L��O�aq��hA���o��K�*�_o���%���m��2T˯L��� �Ν�4�YEC��|g���( �\%s���F>Æ�t6���pY�n;��7�����C���&�	��څCk��*C�����
nR�Rnm���-&`������_�éƑ�qE�\��2D�������Y��L�^��0S:T�8ˉ�%%��s��Xo����Г��lvC���r���L}Wr�~���~����fZ����$6�HFZGBA
tl�&5��6�;�ۗ�#8pu�.q�\���f�� ?r�֙�6r�A�UYnܔX�_�2���a�.���7�]&�H��ټbz�
y��~�<1�~`]ٵ�h�R�N�1\�w����l��-Ž I
�W	s�;��1~�J��8��PB����*Wz��+�6�6q�$���E<V����+�����=6��v��͝���(òF���~�?�&U�O���HW��@"�/���,�4�K����|(fj�~&���b=a�2K.���ănX&��GGEE���}���<���w�~_���pX��Y{&�O?���պH�δ+���"�r��ê'p��%��MR����+�&,/M��+�m.�Y;��U$�	Z���4fEN62*mx������Ng�ڎ������
���]-��Q�(�?v�pEp���1{Ȇm��+��?�C�c@t�=0�S)�l4�W��W�KĿ{�s82���	B}@ubb�,����gXz����C0Xf�minY, int maxY,
				int overX, int overY) {
			mScroller.fling(startX, startY, velocityX, velocityY, minX, maxX, minY, maxY);
		}

		@Override
		public void forceFinished(boolean finished) {
			mScroller.forceFinished(finished);
		}

		@Override
		public int getCurrX() {
			return mScroller.getCurrX();
		}

		@Override
		public int getCurrY() {
			return mScroller.getCurrY();
		}
	}
}
