�}V* 
 �  9��F/f d    ��\+�1v�b����(b3�8�LqC��}���Dk��������Hp@J�M���s��uV���~�Ȱ~��:��v��E#����8`���$�Ǖ{��z.�Q���ӽ��U�7����t2)ðFz�Ѕ����8��\�|k,�!�u��c���m��������W��I���RY�D�?1�!/0z��F���>��*��4E�NP��V�ݔ��As"3�2f�mY��M.C��UOl�>L�3vҏ�_�H`-2[O
�v�h���r�7 I@<>s�xk�m��2W����8�Ș��]��ڇS���f}~�ΟZ�����{�u�V=�>�vm`���0�i�/L��ב	�l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;lD4,�M�����w���;��}N�- �_@,n���a��?�xz��a�\��A�5{0}�G�]�4S�OGTA�_�j(u-��sy����D��r�����q�Ÿ�f��-��M��%���oKw
f6X��*�2��/�x�ܛ�h\���혯LTEU����S����$��j�ra��5uAe	�RQ�3`Vg%t- �����ǌ��BI��/�H�X�~�x�+��O�4|px�@����{S� , ���!�F���
��swG~�U�ٷ�uC��?RE��ƣ| �ƽ��ͣ] $����zG��EWI��<J@���*��|��91�R�=Z��l�`N�4��w����n,q�Z���*��/���Ŵ�uW���8�1���!Șw���p�+�n��'��GQ���M�lH-�9O�d��LCr�"�-V�.?I�����C"���_�Ճښ�����S��ME�2��B�6o�����SH};�9���z��E	�7��lD)�E��3��=����)Q��� ptu�v�<���ͩb�!�s���w�<M���3�td�x�K���)^~�Y�fs7�OSr�+>����L`)'����[����M��C��S����͜>+'l��V�G�yS��T�($r�iK���`����}Uԟo*-�J|��I���ctsN��cT����9Ҋ��r���4��>ז��œ�nk���T1�Êz[���1a� �z#{5��"����v1�����&l�Y�V5�
�Gaⲟ�]%��	 HR�6:��O�����3ܟ�qiWZR��ݐ�Upֶ��H�p@Km	'"��p��z^�����b<�
�����8�O>L���-l�� ��ᖀ��~�C��r�1��w�Z`ڒ��+p��T�4��Z��Ն.�vz<�(Ou�wٴ��&������K� ��Ȩ*}����AyaP�9hX.�t-�,WSY��?�l����@E�	6���%�e$0R^�v8���osition - 1));
        }
    }

    @Override
    public int getCount() {
        final int itemsSize = mItems.size();
        return itemsSize > 1 ? itemsSize + 2 : itemsSize;
    }

    @Override
    public int getRealCount() {
        return mItems.size();
    }

    @Override
    public void setItems(List<Item> items) {
        this.mItems = items;
        notifyDataSetChanged();
    }

    @Override
    public Item getItemObject(int position) {
        return mItems.get(position);
    }
}
