package uz.pdp.spring2lesson2task2andlesson3task1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.spring2lesson2task2andlesson3task1.dto.Response;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Attachment;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public interface AttachmentService {

    Response saveFiles(MultipartFile[] files, MultipartFile[] images);

    List<Attachment> findAll();

    Response saveFile(MultipartHttpServletRequest request);

    Response download(Integer id, HttpServletResponse response);

    Response delete(Integer id);
}
