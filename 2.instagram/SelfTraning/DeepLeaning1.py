install pip pandas
import pandas as pd
import numpy as np
import tensorflow as tf
from tensorflow import keras
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler

# 1️⃣ 데이터 로드 (스마트폰 스펙 & 가격 데이터)
data = {
    "Processor_Score": [250, 300, 450, 500, 700, 900, 1100, 1300],  # 프로세서 성능 점수
    "RAM_GB": [2, 3, 4, 6, 8, 12, 16, 32],  # RAM 용량 (GB)
    "Storage_GB": [32, 64, 128, 256, 512, 512, 1024, 2048],  # 저장공간 (GB)
    "Battery_mAh": [3000, 3500, 4000, 4500, 5000, 5500, 6000, 7000],  # 배터리 용량 (mAh)
    "Camera_MP": [12, 16, 20, 48, 64, 108, 108, 200],  # 카메라 화소 (MP)
    "Price_USD": [150, 200, 300, 400, 600, 800, 1000, 1500],  # 가격 (USD)
}

df = pd.DataFrame(data)

# 2️⃣ 데이터 분리
X = df.drop("Price_USD", axis=1)  # 성능 데이터
y = df["Price_USD"]  # 가격 데이터

# 3️⃣ 데이터 정규화 (모델 학습 최적화)
scaler = StandardScaler()
X_scaled = scaler.fit_transform(X)

# 4️⃣ 훈련 데이터 & 테스트 데이터 분할
X_train, X_test, y_train, y_test = train_test_split(X_scaled, y, test_size=0.2, random_state=42)

# 5️⃣ 딥러닝 모델 구축 (회귀 모델)
model = keras.Sequential([
    keras.layers.Dense(64, activation='relu', input_shape=(X_train.shape[1],)),
    keras.layers.Dense(32, activation='relu'),
    keras.layers.Dense(1)  # 가격을 예측하므로 출력 뉴런은 1개
])

# 6️⃣ 모델 컴파일 및 학습
model.compile(optimizer='adam', loss='mse', metrics=['mae'])
model.fit(X_train, y_train, epochs=100, batch_size=4, validation_data=(X_test, y_test))

# 7️⃣ 테스트 데이터로 가격 예측
predictions = model.predict(X_test)

# 8️⃣ 예측 결과 출력
for i in range(len(predictions)):
    print(f"실제 가격: ${y_test.iloc[i]:,.2f}, 예측 가격: ${predictions[i][0]:,.2f}")
