package com.matsuura.FaceMusicBatch.interfaces;

import com.matsuura.FaceMusicBatch.model.EmotionAndDurationDataModel;

public interface GetEmotionAndDurationListener {

	/** API呼び出し成功時に実行される関数です **/

	public void onSuccess (EmotionAndDurationDataModel data);

	/** API呼び出し失敗時に実行される **/

	public void onFailure (String errorCode);

}
