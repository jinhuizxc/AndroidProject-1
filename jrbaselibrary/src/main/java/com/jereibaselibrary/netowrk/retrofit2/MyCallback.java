�}w* 
 )  ��57�GH    ��A+�ɶ+g�അ��B�A��{�����|���]�%�w��X��_CPq��]��f����>� � ��쬤v ��.�?z$EA�g�i������0~���qR�fI<ԫ�Y��`p� i�z}�b��Y�/���@��׋UB�]~��������6ƐeF�K�'����%��cG�$��u�5���s����������Ϝ����/��U���epŢƷ��QCWhN�h�~,���I>����]�\��<�y�����X��z)��M�S˞�VZ��Y�)�>�����	���5r�r<���B۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;lD�1�} �/<I��+Kr���#ӗGLe|#�gD�Mn!�Y5� ��L�̰ƹ�Nm�j���s���PJw&�n��8�����lδ��a�4�&������]����#~�D��o��?�N����G#Df	1����܅���1ޯz3ނ�DB¯MU��c=U20�����͚)��d`DN��Yͧ�*�;�#��}Vkʪ��M�Z@@�ie.l����B�	_ʶ P�+x�T 	_��Rn����/e��:fw�!(��:u����!sO2&C����0��Y�(/���,��r�P�nR�iE�����}��
|�sc�twr�˵X�*�[�艁G� �+c�ü� ��?���17���Ɩy��1z�I~Ft�xz�(ov�y{�=�ߩ�ת#XX��w:��*g�P;��zI���V��V2�5��%a�RAs�{Mg`��
�z�����Iw<\�����'	��1Uu �v-b����qz�xD��3]��So+�U public void onFailure(Call<T> call, Throwable t) {//网络问题会走该回调
        if(t instanceof SocketTimeoutException){
            //
        }else if(t instanceof ConnectException){
            //
        }else if(t instanceof RuntimeException){
            //
        }
        onFail(t.getMessage());
    }

    public abstract void onSuc(Response<T> response);

    public abstract void onFail(String message);



}

