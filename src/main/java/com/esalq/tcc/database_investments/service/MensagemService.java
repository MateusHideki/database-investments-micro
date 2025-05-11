package com.esalq.tcc.database_investments.service;

import org.springframework.stereotype.Service;

import com.esalq.tcc.database_investments.model.Acao;
import com.esalq.tcc.database_investments.model.Wallet;
import com.esalq.tcc.database_investments.repository.AssetRepository;
import com.esalq.tcc.database_investments.repository.WalletRepository;

@Service
public class MensagemService {

    private final AssetRepository assetRepository;
    private final WalletRepository walletRepository;

    public MensagemService(AssetRepository assetRepository, WalletRepository walletRepository) {
        this.assetRepository = assetRepository;
        this.walletRepository = walletRepository;
    }

    public void saveAsset(Acao acao) {
    	assetRepository.save(acao);
    }
    
    public void saveWallet(Wallet wallet) {
    	walletRepository.save(wallet);
    }
}
