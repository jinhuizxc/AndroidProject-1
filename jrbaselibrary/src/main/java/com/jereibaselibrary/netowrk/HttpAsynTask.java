�}X* 
   6=Ǣ�e�q    ��� +�)w�����	�E̷h�4�P �H�:0a��i��L��%�2p�V��yYo��A�[á��3�f�{`Xk����tL� �],�^"��|rEb\�LRV��6q����'���Dgz��ڷu�+4����BjbW�UHf9h1�ˀ^�Tu�W�m�d(�ی�h'�XLq�ٶ������k����\�%엒�D!�G���UA�c�DO:^�0��q�v�C�R.JG�m�<��I�+���Y�#���(�Or%8��t��s�~��Q�����?R�N�B)\�@�F¦����j>t�T�x��鉦�}mq�mB۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;;

/**
 *
 * 异步请求 通用组件
 * 主要为了  解析json的过程 也在 子线程中执行  因为反射 性能特别差
 * Created by zhush on 2016/9/27.
 * E-mail 405086805@qq.com
 */
public class HttpAsynTask extends AsyncTask<Void, Integer, JRDataResult> {
    HttpUtils client;
    private RequestCall httpRequestCall;//响应回调
    private HandleResponse handleResponse;//组织成功返回值接口

    private String url;
    private HttpCacheInterface httpCacheInterface; l-�K=�5*e�C�,�o�h^�2k
���	��<��7��N�To�H)��4P����upG͏��:�g��H�
D;���V�b-��6hAY' �	x
҃���M��:����{�?���#�` /1I�Q��;��l�
�*?�B-EӤg�ҥ��#Zs�����	kL��|����^���76�>9z�a��%��-�����*y��bJ����!�N��+�J��� �lX����	.l��W�?�] �4����R����Ʉ��s��/}e(��N�=��e�p�ξ@SI�1'�HyF����I����V6i�.��Δ�3�!�?DJ+^���|bʃ!P�.�+��+c�3Z��ē�|��w^ �#����<)i�����Z�{��'`%��!�pg������Ge^-Yr�$$7�̿�ga~���hu]{��WK3��Ɵ�`��(���������7�1�M�OYw8��*	�B��l�@��7�x�g��Lߠ"��v�l�*��b0y
{�R� �f���85'�� �)�1���	/�"�����~�M)��EO}���v��u��Co�Ć[����4	�_5I)ݎ-�<����ܒ�[��P
A���lz�����	)�%&�_<n��9�p�C�E�!�G.� ��7d�g�'��y2�q}���]�]�!����y6�д}Xߣ����u�6�3S(�>�irv�ի���4�REtx�R+����x��F[�M�
֘�L2��=䶱��0�kV?o����}Dɗ�ACn��q�DV�:��v9wj?1Y�Q)S�'dS�W���4�N�Xhg�W�"�c�3�
_:��Gjg��}������C1���8u���C(������K�����E����@�ǩ�ei����qYn.lSLi[Q܈��1�V�^yX`�{�Ip#���@>�׵X�c�.Ƭ��`g�ծ����E�+$��C���w��(�zw[e���s��7��3v�&w��m���q��L�_�lD*|`�
��s�s�,ZcOR����C������L�5D��u/�W�}1� ]�
V��Qd{8� �(�(/��ΰCf�B���9Jt�m�D��
��B�e�ê7��5�ş�FS���]]ni����� �I��/ �:4&�%����u�W:�а�Y<�m=߇�,`��y�7��~e".�ӵ�������d��)���6�r<�b�Cx�P:�H����i�L;/ ���_m'0M�(�N!����刍��>xrԣ�s ۟�(J���>�eOj
< G��{O�#o?�K)��~��>KO��G% ����\\Z�.��4cU�R=ǆ�cW��J������� ��Ʊ�9�F�c�Ia�ʗ�m�lNdtx	Ow[�
i�#�l����GF���9EGQ��;�a�o��0�C27V]/$U�C@BN�0̀S�{�����q��d����c1|_AK{��3@����4�.�p-���C$�V?�1��2<i�sa�p�l&��H�j1�H�L�H��s��*x��\�퀶���c�B�jq۰�R=!(���5�~&�kΥ�c����B���9�c�B��<|j_�M#���m��E���{�Ǹ���pge�{Q2�E| �s~+x�\.�~%`[�bi��ڿe��1��)�s?̤����ogRd�D���>��~���_˕xD�!�Z?�a�\�JUb[��nסC3l���䟎��i��,�A�;i�1�� �1$fi{A�����F	��d�"��J�~����h�0f�J�<��L���R��红�d,�(P�p8�v��D�.���|k���@��-.vz�(��cOy��\.>R���H��Ŵ�(bt���,���أ����`�9�L�r���1��<cX�۬}樠Iv�8G&3+I����&,�\#�%Z@��W�����i�W^q�S�ވ3W�#������`!*!#��?,*Y��9���`��y(Ǭ����h��9;�(��K��c%� l&���$6�T2
��}3�j��B��H��!릥H�h���1a�|�>e�-Z��%��;R�I���8?��N��l��h�!��>I<L�}86�|%}M�t�(P�W��x|�e'c1�"� M5^�b^U��7Zm�|�fj�{��s?̤�<z� 

�ɷ�EK��k��v�D0U��*��TU_Fc�Y?�v�Y�Y}y|	����K:e���Ο���i��,�Q�u=�v:���-�yp29 ��K���F��Az�Oĸ"�*���� �84��3��/����ﳹ8�d,�(P�pe���D�.���|k������La%aq�mG�}�16��T'7R�ǻH�%�Ŵ�(bt���,��������� �r�{�S�����a,3�˦(f鲺[0�xf73A�����;�a�o��0�C27V]/$U�C@BN�0̀S�{�����q��d����c1|_AK{��3@����4�.�p-���C$�V?�1��2<i�sa�p�l�<F�cƆ��3���X�϶�#����*c�A�ޮ��[�]K����.�V'���%|��i���Ý��+^@3�$ȳzvjk�t���:M���:��~��iGG��ŸaFW�a�e����^����A�d3�%�7�����&��<|��!��[~�ys��T��(���ˎ�T,�h/��6�`�:-���t('#O9� rP���fN}�(i6/
a��ɧ�>6���I��|;���	j����
	���[�z'����SGtۀ�gsnɓjɨm:�*�X{d�1O��*M�p�,k�7�X3�kE��l]�G����#����X�4:��w!߅t����v
�$/���8�7�6XK��/�@��e����r�!��]�vAJ��ɮ��
���qPT���cU�t�|��;{�{ ��,[��(HlLҿ%u�?Eg)�d#��4}m&9c�6!����z;����ND������
�'��3�D����QߋUIi3�y�v����lD%T��P��gr��Yu{�ʗ�,Ѓ�l�$�y������W>+��$v~Op�Z�T���#w~� �������q�}!��-o�6m��x�4&PH��Ô�����=��uQ"aQ���Ic�
�H�emI1Jܴ�&��F�����Wx�\Kʸ��8^���^�1��^�kR�[�k%YV8�n��@��'��M�]qΗgܹ_U�[6�ô�<�:N"�?x��pH�ma�(�`�E?j��T�¹�n4�؛��Ȑ��!�\��F�4�R�ȣ�Y�Y�u]�k�N!�>~j�*��R'���&֖v���ADv�S/�}`�hy��>�|O���X�@ �TG<�c]Խ/|z\<�Ѷ�҈���6�_�?� v�|, �gF��Cw���y�2��i�����<��(�X��x|e����^&?����3�_��A��tQK^F��?��E:r���\��ͭ2�ᥠ�K��1t\��<���J�TJ�j+iһ[&���|�ձ���$Jl�(O��~���X~Z}s�����S}��&p.p��L���d�?#�I1�6O��P�
P�hr����ፐ���B��1�>{��K	�+qT��
�Ix4��[�H�j�����LGW����P%z�w��%����ENb\A��9�Eu�>�����M�ѥs�Q�b|�O������Q_JĿ�,��Zܚ�%��Zi�E�Or�����0?�ǵ�u�>)Ŕѐ@��Y'=ݵ���YQӪ���?�+��^��tb^MȬ�8`������R�"�6|s�3v_�t�V�@n+��2�/������q��B��<+Cb}Y�2k�����!��Hm����:wK3{���nbm�� jz�Ÿ�g�����pY��uE{K��o\����4@�*����EI)iyϧ� )��(V¿s�+�$�p䫚7�@<�H��5yW�P3L?���2q�A?�ʪ�7X�R�
��JX&�?�0�$���W�w���Y�]�~�7�Z~&U��B���o5;f�l*|=:>(���LS�B��
|�1�U�\�9��lGeф��A�,�)QQ:q���5�~����g�FR_�	4�Q�	�H����Q"�g�c�:s~��>�)^�����pRQXb�N	Lh??�g��-�#*�E����k%`��Dt�Wd��e���室Y�#�'(�y��{kfo��GH�o@��Y]�T,d��n�2&��4?7ߋ�6�S�u�LA%[jp[!��aDM/SXW���ߓBU��:��N�X�k5�.����qk#p
7q��W���o���u��nIG9��#'C���yWq(��fL ²f�'�G�s���~f� �~��R� �A3�����	��'��"�1��sZ����ҳn
����X#�!���R ǳ@Uw�?4��;�T	WW�SIf��L�o�>D�2�5veϺP(�<|��>�ޖ8uI#5�������h㞼�`5���it���5�O���@�F�8p��z�g�U�?ϰ+�`a���!]������8@Ͽ���:��tYlD%T��pѶb��ۢ���/GL�t���A��J�,'�m#b�m��(�VA��-I��n(e��M�l=����"����Ww�5w�ؖj��C4�^9����t���਷�3���G�f���R��k0��;��]�բ9K�|An�M$|�z�\K��VBO��|6ۑ��R���*��$Q.9J���|e�����wgކv���Tp��ќo�{ v�Qs~��9q�J&�v�Y#�1m+��\���n4��Ջ]�����o�>���2
�T����O�AV�;�b�Ns����98�`��8)�zͥI1[Ց�9�l�8$�c��>�2?�œ`�gu�J dLj���&��VV>J__֟'Q#M:�I��?�'\2�=~A�g��ZC����k��������p]��s}���,��DDH�8weT�m����G��{�F�c����)��w����DKY����8���Db�*�[�3�	}�L:�Fx�V�d�y^��~�I��fZ�HPty���l$R�&���-���JC�i����Q�5��;�X%��H�2�-Ѧ�X0�5V	���I���R���`ź5��O.�~*��%Ȼ�rĽ��R)~ȗ�5�B8�Ef>�d����l�>.r�-�-��Aɫ�n�`՞��pG�p� ������-�c�f����1��I��_��������}�������n�^�Ō��8p��	�\�om��@�'���>��1	����3ywp�'6��a�W<6$�aB:��6q �h�y
;��h�=�����sZd��㤱�܀��o�ו������;��8� xa�怘x�§f�f=�=�FG����:�"����DN#�^vжW���"~�KZ�)G�-u��'��4������ly0����=�3ro�{���G��j���\*5P�U$6�����e����Y�ţ�������12��`Nw�l����_��y���a�>�w�Qqc�����Ȼ������1�    this.httpCacheInterface = httpCacheInterface;
        this.cacheTrigger =cacheTrigger;
    }

    public static interface  HttpCacheInterface{
        public void getHttpCache(    JRDataResult result);
    }
}
