�}�* 
 �  F������    ��(+�ɷ�g����;_�Za��e�߲Ηֳ��{��A���fy���ں�|�I�4�J\紹}� zV��jE��-�p��O
��ra�IE]R��m �������u�
 �*7I�0Ϧ�Ժ8Z�=��_T�⛔:�z�"�}s.�I ���S�
��ΐ�r�����S�8�ik�#��[�oXɐEL�R�>��n,�/�*����K�BJBb�.
˧�`�ٜfȋsT����7��]�s(ç�T�X�d7�Y/��xزW�Sa��E�t�[���V�5���?�0�-+v��j>t�T�x��鉦�}mq�mB۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;uper(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.voice_sending, this);
        ImageView img = (ImageView)findViewById(R.id.microphone);
        img.setBackgroundResource(R.drawable.animation_voice);
        frameAnimation = (AnimationDrawable) img.getBackground();

    }

    public void showRecording(){
        frameAnimation.start();
    }

    public void showCancel(){
        frameAnimation.stop();
    }

    public void release(){
        frameAnimation.stop();
    }
}
