package org.wildcodeschool.wildspringblog.service;

import org.springframework.stereotype.Service;
import org.wildcodeschool.wildspringblog.dto.ImageDTO;
import org.wildcodeschool.wildspringblog.mapper.ImageMapper;
import org.wildcodeschool.wildspringblog.model.Image;
import org.wildcodeschool.wildspringblog.repository.ArticleRepository;
import org.wildcodeschool.wildspringblog.repository.ImageRepository;

import java.util.List;

@Service
public class ImageService {
    private final ImageRepository imageRepository;
    private final ArticleRepository articleRepository;
    private final ImageMapper imageMapper;

    public ImageService(ImageRepository imageRepository, ArticleRepository articleRepository, ImageMapper imageMapper) {
        this.imageRepository = imageRepository;
        this.articleRepository = articleRepository;
        this.imageMapper = imageMapper;
    }


    public List<ImageDTO> getAllImages() {
        List<Image> images = imageRepository.findAll();
        return imageMapper.convertToDTOList(images);
    }

    public ImageDTO getImageById(Long id) {
        Image image = imageRepository.findById(id).orElse(null);
        if (image == null) {
            return null;
        }
        return imageMapper.convertToDTO(image);
    }

    public ImageDTO createImage(Image image) {
        Image savedImage = imageRepository.save(image);
        return imageMapper.convertToDTO(savedImage);
    }

    public ImageDTO updateImage(Long id, Image imageDetails) {
        Image image = imageRepository.findById(id).orElse(null);
        if (image == null) {
            return null;
        }
        image.setUrl(imageDetails.getUrl());
        Image updatedImage = imageRepository.save(image);
        return imageMapper.convertToDTO(updatedImage);
    }

    public boolean deleteImage(Long id) {
        Image image = imageRepository.findById(id).orElse(null);
        if (image == null) {
            return false;
        }
        imageRepository.delete(image);
        return true;
    }
}