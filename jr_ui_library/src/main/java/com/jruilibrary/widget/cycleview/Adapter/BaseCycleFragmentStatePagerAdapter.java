�}�* 
 �  ���R��|    ��� +�1�'c���,���L������	�K.NZ'P�k��q���\�/�բ�����߃��G�04�C�]qU�K�h/�Rm�nF��?'�S1 Ĕ������:��#J��� �n�r�m6>c��ƸƁ��F��^��ˁ�u�����`��N���a��Ԛ,j2h�;��I*�E1 ?q]�y���A�����T��y?�I='�]��"E�\Fm"�H�9���`ӘvNML��A�d�����
\S��a�Or%8��t��s�~��Q�����?R�N�B)\�@�F¦����j>t�T�x��鉦�}mq�mB۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;l�&^�Y�-�����(ci��Ä�o�%g��!�����c�fѰvw��S�Jp_�4�������S.�R\Rv��u�[J�&�I��+���ñ^ON���Ҋ��������8���wuA&H˄���Y��I�dXM�l[����)!t�&jJ��[�0�X�����Y���!^^rC����Z;��'��2��8}�@t%�����=���5��wRK@Y�e�Ml6�>LIC��y�qP�G�俒x�\�7�=0%�V|��N�f�^bv���еL����b��_���L0�ec� �]kQi+-���Pk�*��$�y��)HC}^L
Qi��n�#��=��-�gŞ[�j��m�Fi�^YAuHMY..@�������u�Z\G?�@��|>��)����n�ۀԭ�Pi���	L��E�Y@6�����G�`�nNq��J��As:C@1��� ]W'/� 4]q���ՕI(#ʖ�6��b�,x�9=e ���-l��U;�9Ntk�=4�������@F��T��C����r�j%����f��c'p�D.F�6�'�VJe��8B��M�cާH�f���K���a	zQ�>�|\ ���_� mJ�&���.�n������IϨ�M�ύF�.�X�p�3��;�|���y���>!�'��oa�I�����kyP�\�j� ��ɣa�`�<xb�C���O"��8�*����s�~�>��A�A�of��;�0�?�}���S��Je�~D��Q���N|��IV"�=� Ϩm�7,�H�dß�{*d�NN����
�t~�l�ݦW/�C%�7
+{����լKg�vK?'V��W�������Φ��K�М����^0]Џ�m<��cJ&,��\yK�Ř�w
�C6�c�<j��w��1	=a͈ WC~�#Y�Fr���}�X_�����	����@��g��E��m�^�6S`ҋtC��z%H��v��/��1�+s~-�$WKαao�>ps�ܭ� �I���$��^��ͽ�*��KK�暴的解决刷新问题，感觉效率不是很高
        return POSITION_NONE;
    }

    @Override
    public int getRealCount() {
        return mItems.size();
    }

    @Override
    public void setItems(final List<Item> items) {
        this.mItems = items;
        notifyDataSetChanged();
    }

    @Override
    public Item getItemObject(int position) {
        return mItems.get(position);
    }

}
